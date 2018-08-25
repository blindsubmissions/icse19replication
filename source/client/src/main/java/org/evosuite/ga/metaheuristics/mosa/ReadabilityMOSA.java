package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.Properties;
import org.evosuite.ga.Chromosome;
import org.evosuite.ga.ChromosomeFactory;
import org.evosuite.ga.ConstructionFailedException;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.ga.metaheuristics.mosa.comparators.OnlyCrowdingComparator;
import org.evosuite.ga.metaheuristics.mosa.comparators.TestQualityComparator;
import org.evosuite.testcase.TestCase;
import org.evosuite.testcase.TestChromosome;
import org.evosuite.testcase.TestFitnessFunction;
import org.evosuite.testcase.statements.ConstructorStatement;
import org.evosuite.testcase.statements.FunctionalMockStatement;
import org.evosuite.testcase.statements.MethodStatement;
import org.evosuite.testcase.statements.Statement;
import org.evosuite.testcase.statements.reflection.PrivateMethodStatement;
import org.evosuite.testcase.variable.VariableReference;
import org.evosuite.utils.LoggingUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class ReadabilityMOSA<T extends Chromosome> extends MOSA<T> {

    private static final Logger logger = LoggerFactory.getLogger(ReadabilityMOSA.class);

    private Comparator<TestChromosome> comparator;
    private double lastEntropy;

    public ReadabilityMOSA(ChromosomeFactory<T> factory) {
        super(factory);
        if (Properties.RANKING_TYPE == Properties.RankingType.ENTROPY_SORTING) {
            ranking = new EntropyBasedPreferenceSorting<>();
            comparator = new TestQualityComparator();
        } else {
            comparator = new Comparator<TestChromosome>() {
                @Override
                public int compare(TestChromosome chromosome, TestChromosome t1) {
                    return Integer.compare(chromosome.size(), t1.size());
                }
            };
        }
        lastEntropy = 0.0;
        LoggingUtils.getEvoLogger().info("Ranking Type: " + ranking.getClass().getName());
    }

    /**
     * Returns the number of method calls for a test case
     * @param chromosome the test case
     */
    private int getNumberOfPotentialSlices(TestChromosome chromosome) {
        int nSlices = 0;
        for (Statement statement : chromosome.getTestCase()) {
            String className = statement.getReturnValue().getClassName();
            if (className.equals(Properties.TARGET_CLASS)) {
                nSlices++;
            }
        }

        return nSlices;
//        int nCalls = 0;
//        TestCase testCase = chromosome.getTestCase();
//        for (Statement stmt : testCase) {
//            if (isMethodCall(stmt))
//                nCalls++;
//        }
//        return nCalls;
    }

    /**
     * Checks whether a given statement is a method call
     * @param stmt the statement to test
     * @return true whether the statemetn is a method call; false otherwise
     */
    public boolean isMethodCall(Statement stmt) {
        return (stmt instanceof ConstructorStatement
                || stmt instanceof MethodStatement
                || stmt instanceof PrivateMethodStatement
                || stmt instanceof FunctionalMockStatement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("Duplicates")
    protected void evolve() {
        List<T> offspringPopulation = this.breedNextGeneration();
        // Create the union of parents and offSpring
        List<T> union = new ArrayList<>();
        union.addAll(population);
        union.addAll(offspringPopulation);
        double currentEntropy = population.stream().mapToDouble(t -> ((TestChromosome)t).getEntropy()).average().getAsDouble();
        double deltaEntropy = currentEntropy - lastEntropy;

        List<T> slicePopulation = new ArrayList<>();
        if (deltaEntropy > 0) {
            lastEntropy = currentEntropy;

            if (Properties.SLICING) {
//            double bigEntropy = offspringPopulation.stream().mapToDouble(t -> ((TestChromosome)t).getEntropy()).average().getAsDouble();
                boolean[] visited;

                //for each test in the front
                for (T test : offspringPopulation) {
                    TestChromosome testChromosome = (TestChromosome) test;

                    Collection<Slice> slices = getAllMasterSlices(testChromosome.getTestCase());

//                TestCase testCase = testChromosome.getTestCase();
//
//                List<Slice> slices = new ArrayList<>();
//                visited = new boolean[testCase.size()];
//                // per ogni elemento di visited (statement)
//                for (int i = 0; i < visited.length; i++) {
//                    //se non è visitato
//                    if (!visited[i]) {
//                        getSlices(testCase, visited, i, slices);
//                    }
//                }
//
//                slices.addAll(getTrivialSlices(testCase));
                    slices.forEach(slice -> slice.getStatementsOfSlice().sort(Comparator.comparingInt(Statement::getPosition)));
                    for (Slice s : slices) {
                        TestChromosome toAdd;
                        try {
                            toAdd = testChromosome.getTestChromosomeFromSlice(s);
                            T sliceChromosome = (T) toAdd;
//                        removeUnusedVariables(sliceChromosome);
                            slicePopulation.add(sliceChromosome);
                        } catch (ConstructionFailedException e) {
//                        LoggingUtils.getEvoLogger().error(e.getMessage());
                        }
                    }
                }
                union.addAll(slicePopulation);
            } // end add elements from the slicing to the new population
        }
        // Ranking the union
        logger.debug("Union Size =" + union.size());
        // Ranking the union using the best rank algorithm (modified version of the non dominated sorting algorithm
        ranking.computeRankingAssignment(union, uncoveredGoals);

        // add to the archive the new covered goals (and the corresponding test cases)
        //this.archive.putAll(ranking.getNewCoveredGoals());

        int remain = population.size();
        int index = 0;
        List<T> front = null;
        population.clear();

        // Obtain the next front
        front = ranking.getSubfront(index);

        while ((remain > 0) && (remain >= front.size()) && !front.isEmpty()) {
            // Assign crowding distance to individuals
            distance.fastEpsilonDominanceAssignment(front, uncoveredGoals);

            // Add the individuals of this front
            population.addAll(front);

            // Decrement remain
            remain = remain - front.size();

            // Obtain the next front
            index++;
            if (remain > 0) {
                front = ranking.getSubfront(index);
            }
        }

        // Remain is less than front(index).size, insert only the best one
        if (remain > 0 && !front.isEmpty()) { // front contains individuals to insert
            distance.fastEpsilonDominanceAssignment(front, uncoveredGoals);
            Collections.sort(front, new OnlyCrowdingComparator());
            for (int k = 0; k < remain; k++) {
                population.add(front.get(k));
            } // for

            remain = 0;
        } // if
        currentIteration++;
    }

    /**
     * This method update the archive by adding test cases that cover new test goals, or replacing the old
     * tests if the new ones are lower in term of coverage entropy (defined in the actual work), at the same
     * level of coverage
     * Looking at Hassan 2009, we can take the simpler definition of entropy of a change, adapting it to the
     * coverage! More formally:
     * C = {m1, m2, ..., mn} is a class with n methods.
     * Tc is a test case that target such a class
     * We define the entropy of a Tc, i.e., H(Tc) = - sum_i=i to n (cov(mi)/cov(c) * log2 (cov(mi)/cov(c))
     *
     * @param newSolution a candidate solution
     * @param covered     the already covered fitness values
     */
    protected void updateArchive(T newSolution, FitnessFunction<T> covered) {
        TestChromosome newSolutionTestChromosome = (TestChromosome) newSolution;
        newSolutionTestChromosome.getTestCase().getCoveredGoals().add((TestFitnessFunction) covered);
        // store the test cases that are optimal for the test goal in the
        // archive
        if (archive.containsKey(covered)) {
            TestChromosome existingSolutionTestChromosome = (TestChromosome) this.archive.get(covered);
            // if the new solution is better (based on secondary criterion), then the archive must be updated

            if (comparator.compare(newSolutionTestChromosome, existingSolutionTestChromosome) < 0)
                archive.put(covered, newSolution);
        } else {
            ((TestChromosome) newSolution).getEntropy();
            archive.put(covered, newSolution);
            this.uncoveredGoals.remove(covered);
        }
    }

    public Collection<Slice> getAllMasterSlices(TestCase testCase) {
        Set<Slice> masterSlices = new HashSet<>();
        Set<Slice> breadcrumbSlices = new HashSet<>();

        Set<VariableReference> masterVariables = new HashSet<>();
        Map<VariableReference, Slice> definerSlices = new HashMap<>();

        for (Statement statement : testCase) {
            VariableReference defined = statement.getReturnValue();

            Set<Slice> dependencies = new HashSet<>();

            for (VariableReference variableReference : statement.getUniqueVariableReferences()) {
                if (variableReference.equals(defined))
                    continue;

                if (!definerSlices.containsKey(variableReference))
                    return masterSlices;
                dependencies.add(definerSlices.get(variableReference));
            }

            if (defined.getClassName().equals(Properties.TARGET_CLASS)) {
                // Add master slice

                Slice masterSlice = new Slice();
                masterSlice.merge(dependencies);
                masterSlice.addStatementToSlice(statement);
                // Injects all the dependencies in a new master slice

                // Adds the statement and adds it to the set of master slices
                definerSlices.put(defined, masterSlice);

                masterSlices.add(masterSlice);
                masterVariables.add(defined);
            } else {
                Slice newSlice = new Slice();
                newSlice.merge(dependencies);
                newSlice.addStatementToSlice(statement);

                for (Statement sliceStatement : newSlice.getStatementsOfSlice()) {
                    definerSlices.put(sliceStatement.getReturnValue(), newSlice);
                }


                if (statement.getUniqueVariableReferences().stream().anyMatch(masterVariables::contains)) {
                    breadcrumbSlices.addAll(dependencies.stream().filter(masterSlices::contains).collect(Collectors.toSet()));

                    masterSlices.removeAll(dependencies);
                    masterSlices.add(newSlice);
                }
            }
        }

        masterSlices.addAll(breadcrumbSlices);
        return masterSlices;
    }

    public Collection<Slice> getAllSlices(TestCase testCase) {
        Set<Slice> completeSlices = new HashSet<>();
        Set<Slice> partialSlices  = new HashSet<>();

        Map<Slice, Set<VariableReference>> sliceDefs = new HashMap<>();

        for (Statement statement : testCase) {
            Set<Slice> matchingSlices = new HashSet<>();

            VariableReference statementDef = statement.getReturnValue();
            Set<VariableReference> statementUses = statement.getVariableReferences();
            statementUses.remove(statementDef);

            for (Slice completeSlice : completeSlices) {
                Set<VariableReference> common = new HashSet<>(statementUses);
                common.retainAll(sliceDefs.get(completeSlice));
                if (common.size() > 0) {
                    matchingSlices.add(completeSlice);
                }
            }

            if (matchingSlices.size() == 0) {
                Slice newSlice = new Slice();
                newSlice.addStatementToSlice(statement);
                completeSlices.add(newSlice);

                sliceDefs.put(newSlice, new HashSet<>());
                sliceDefs.get(newSlice).add(statementDef);
            } else if (matchingSlices.size() == 1) {
                Slice matchedSlice = new ArrayList<>(matchingSlices).get(0);
                matchedSlice.addStatementToSlice(statement);

                sliceDefs.get(matchedSlice).add(statementDef);
            } else {
                Slice mergedSlice = new Slice();
                sliceDefs.put(mergedSlice, new HashSet<>());
                for (Slice matchingSlice : matchingSlices) {
                    mergedSlice.merge(matchingSlice);

                    sliceDefs.get(mergedSlice).addAll(sliceDefs.get(matchingSlice));
                }

                completeSlices.removeAll(matchingSlices);
                partialSlices.addAll(matchingSlices);

                mergedSlice.addStatementToSlice(statement);
                completeSlices.add(mergedSlice);

                sliceDefs.get(mergedSlice).add(statementDef);
                //Here, mergedSlice is the complete slice, while the old matching slices are the partial slice
            }
        }

        Set<Slice> allSlices = new HashSet<>();
        allSlices.addAll(completeSlices);
        allSlices.addAll(partialSlices);

        return allSlices;
    }

    public Collection<Slice> getTrivialSlices(TestCase testCase) {
        Set<VariableReference> allVariables = new HashSet<>();
        for (Statement statement : testCase) {
            allVariables.addAll(statement.getUniqueVariableReferences());
        }

        List<VariableReference> allVariablesList = new ArrayList<>(allVariables);
        List<Slice> slices = new ArrayList<>();
        for (VariableReference ignored : allVariables) {
            slices.add(new Slice());
        }

        for (Statement statement : testCase) {
            if (statement.getUniqueVariableReferences().size() == 0) {
                for (Slice slice : slices) {
                    slice.addStatementToSlice(statement);
                }
            } else if (statement.getUniqueVariableReferences().size() == 1) {
                for (int i = 0; i < allVariablesList.size(); i++) {
                    if (allVariablesList.get(i).equals(statement.getUniqueVariableReferences().get(0))) {
                        slices.get(i).addStatementToSlice(statement);
                        break;
                    }
                }
            }
        }

        return slices;
    }

    /**
     * todo: add javadoc
     *
     * @param testCase
     * @param visited
     * @param index
     * @param slices
     * @return
     */
    public void getSlices(TestCase testCase, boolean[] visited, int index, List<Slice> slices) {

        Slice s = new Slice();
        s.addStatementToSlice(testCase.getStatement(index));
        visited[index] = true;
        int visitedLength = visited.length;

        //per i che va dall'indice del primo statement(+1) della slice
        for (int i = index; i < visitedLength; i++) {

            //se i non è visitato
            if (!visited[i]) {

                Statement currentStatement = testCase.getStatement(i);

                //prendo le vr dello statement
                List<VariableReference> vrList = currentStatement.getUniqueVariableReferences();

                //se le vr di s sono contenute in quelle attuali
                if (s.isContained(vrList)) {

                    //scorro le vr attuali al contrario
                    for (int j = vrList.size() - 1; j >= 0; j--) {

                        //recupero lo statement relativo alla vr in cui mi trovo
                        Statement st1 = testCase.getStatement(vrList.get(j).getStPosition());

                        //se nella slice lo statement non è presente
                        if (!s.getStatementsOfSlice().contains(st1)) {

                            //verifichiamo se tutte le vr dello statement sono coperte
                            for (VariableReference v : st1.getUniqueVariableReferences()) {

                                if (!visited[v.getStPosition()]) {

                                    //aggiungiamo lo statement non coperto
                                    s.addStatementToSlice(testCase.getStatement(v.getStPosition()));
                                    visited[v.getStPosition()] = true;
                                }
                            }
                            if (!visited[st1.getPosition()]) {
                                //e aggiungiamo lo statement in questione
                                s.addStatementToSlice(st1);
                                visited[st1.getPosition()] = true;
                            }
                        }
                    }
                }
            }
        }

        boolean merged = this.refineSlices(s, slices);

        Collections.sort(s.getStatementsOfSlice(), Comparator.comparingInt(Statement::getPosition));

        if (!merged) {
            slices.add(s);
        }
    }

    /**
     * todo: add javadod
     *
     * @param slice
     * @param slices
     * @return
     */
    public boolean refineSlices(Slice slice, List<Slice> slices) {

        boolean merged = false;
        int slicesSize = slices.size();
        SliceManager sm = new SliceManager();

        for (Statement s : slice.getStatementsOfSlice()) {
            for (VariableReference vr : s.getUniqueVariableReferences()) {
                if (slicesSize > 0) {
                    for (int i = slicesSize - 1; i >= 0; i--) {
                        merged = false;
                        Slice actualSlice = slices.get(i);
                        if (actualSlice.getVariableReferencesOfSlice().contains(vr)) {
                            sm.mergeSlice(actualSlice, slice);
                            slices.remove(slice);
                            merged = true;
                            break;
                        }
                    }
                    if (merged)
                        break;
                }
            }
            if (merged)
                break;
            if (merged)
                break;
        }
        return merged;
    }

    /**
     * todo: add javadoc
     *
     * @param toOrder
     * @return
     */
    public void orderSlice(Collection<Slice> toOrder) {
        for (Slice s : toOrder)
            s.getStatementsOfSlice().sort(Comparator.comparingInt(Statement::getPosition));
    }

    /**
     * todo: add javadoc
     *
     * @param slices
     * @return
     */
    public ArrayList<Slice> getBanalSlices(ArrayList<Slice> slices) {

        SliceManager sliceManager = new SliceManager();

        ArrayList<Slice> banalSlices = new ArrayList<>();

        for (Slice slice : slices) {
            ArrayList<Statement> variableDeclarationStatements;
            variableDeclarationStatements = getVariableDeclarations(slice);

            for (Statement s : variableDeclarationStatements) {
                ArrayList<Statement> simpleRelatedStatements;
                simpleRelatedStatements = getSimpleRelatedStatements(s, slice);

                Slice newSlice = sliceManager.fromArrayListToSlice(simpleRelatedStatements);
                banalSlices.add(newSlice);
            }
        }
        return banalSlices;
    }

    /**
     * todo: add javadoc
     *
     * @param slice
     * @return
     */
    public ArrayList<Statement> getVariableDeclarations(Slice slice) {

        ArrayList<Statement> variableDeclarations = new ArrayList<>();

        for (Statement s : slice.getStatementsOfSlice()) {

            if (s.getUniqueVariableReferences().size() == 1) {
                variableDeclarations.add(s);
            }
        }
        return variableDeclarations;
    }

    /**
     * todo: add javadoc
     *
     * @param variableDeclarationStatement
     * @param slice
     * @return
     */
    public ArrayList<Statement> getSimpleRelatedStatements(Statement variableDeclarationStatement, Slice slice) {

        ArrayList<Statement> simpleRelatedStatement = new ArrayList<>();
        simpleRelatedStatement.add(variableDeclarationStatement);

        for (int i = 0; i < slice.getStatementsOfSlice().size(); i++) {

            Statement currentStatement = slice.getStatementsOfSlice().get(i);

            if (isVRContained(variableDeclarationStatement, currentStatement)) {

                if (currentStatement.getUniqueVariableReferences().size() == 2) {

                    simpleRelatedStatement.add(currentStatement);

                }
            }
        }
        return simpleRelatedStatement;
    }

    /**
     * todo: add javadoc
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean isVRContained(Statement s1, Statement s2) {

        boolean isVRContained = false;
        VariableReference v = s1.getUniqueVariableReferences().get(0);

        if (s2.getUniqueVariableReferences().contains(v)) {
            isVRContained = true;
        }
        return isVRContained;
    }
}
