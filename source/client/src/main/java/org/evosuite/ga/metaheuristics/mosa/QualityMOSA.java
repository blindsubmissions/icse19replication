package org.evosuite.ga.metaheuristics.mosa;

import nl.tudelft.APIs.SmellinessDetector;
import org.evosuite.Properties;
import org.evosuite.ga.Chromosome;
import org.evosuite.ga.ChromosomeFactory;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.ga.metaheuristics.mosa.comparators.OnlyCrowdingComparator;
import org.evosuite.testcase.TestChromosome;
import org.evosuite.testcase.TestFitnessFunction;
import org.evosuite.utils.LoggingUtils;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;

/**
 * Implements the quality based approach described in the paper
 * Automatic Test Case Generation: What If Code Quality Matters? by Palomba et.al.
 *
 * @author xxx
 */
public class QualityMOSA<T extends Chromosome> extends MOSA<T>  {

    private static final Logger logger = LoggerFactory.getLogger(QualityMOSA.class);
    private SmellinessDetector smellinessDetector;

    public QualityMOSA(ChromosomeFactory<T> factory) {
        super(factory);
        String sourcePath = Properties.SOURCE_PATH;
        LoggingUtils.getEvoLogger().info("Production Code Path: " + sourcePath);
        if (sourcePath == "")
            throw new RuntimeException("To run qMOSA you need to specify a source path via the argument -DsourcePath");
        smellinessDetector = new SmellinessDetector(sourcePath);
        ranking = new QualityBasedPreferenceSorting<>(smellinessDetector);
        LoggingUtils.getEvoLogger().info("Ranking Type: " + ranking.getClass().getName());

    }

    /** {@inheritDoc} */
    @Override
    @SuppressWarnings("Duplicates")
    protected void evolve() {
        List<T> offspringPopulation = breedNextGeneration();

        // Create the union of parents and offSpring
        List<T> union = new ArrayList<T>();
        union.addAll(population);
        union.addAll(offspringPopulation);

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
            } // if
        } // while

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

    @Override
    /**
     * In this formulation, we first compute a new quality measurement taking into account the entire
     * archive; then, if the ne quality is lower, we update the quality itself and update the archive
     */
    protected void updateArchive(T solution, FitnessFunction<T> covered) {
        TestChromosome chromosome = (TestChromosome) solution;
        chromosome.getTestCase().getCoveredGoals().add((TestFitnessFunction) covered);

        if (archive.containsKey(covered)) {
            TestChromosome existingSolution = (TestChromosome) this.archive.get(covered);
            double[] quality = computeQualityToArchive(chromosome);
            if ((0.5 * quality[0] + 0.5 * quality[1]) < existingSolution.getQuality()) {
                chromosome.setQuality(quality[0], quality[1]);
                ((TestChromosome) solution).getEntropy();
                this.archive.put(covered, solution);
            }
        } else {
            ((TestChromosome) solution).getEntropy();
            double[] quality = computeQualityToArchive(chromosome);
            chromosome.setQuality(quality[0], quality[1]);
            archive.put(covered, solution);
            this.uncoveredGoals.remove(covered);
        }
    }

    /**
     * According to the original formulation described in the paper, the quality needs to be recomputed when
     * the individual is added into the archive (only the coupling actually), according to the test suite that is
     * in the archive
     * @param solution solution to update
     */
    private double[] computeQualityToArchive(TestChromosome solution) {
        List<String> archiveSourceCode = new ArrayList<>();
        for (FitnessFunction<T> key: archive.keySet()) {
            TestChromosome auxChromosome = (TestChromosome) this.archive.get(key);
            archiveSourceCode.add(auxChromosome.getTestCase().toCode());
        }
        double coupling = smellinessDetector.evaluateCoupling(solution.getTestCase().toCode(), archiveSourceCode);
        double cohesion = solution.getCohesion();
        // avoid to recompute the cohesion
        if (cohesion == Double.NaN) {
            // this should not be the case
            cohesion = smellinessDetector.evaluateCohesion(solution.getTestCase().toCode());
        }
        return new double[]{cohesion, coupling};
    }
}
