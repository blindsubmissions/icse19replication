package org.evosuite.ga.metaheuristics.mosa;

import nl.tudelft.APIs.SmellinessDetector;
import org.evosuite.ga.Chromosome;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.testcase.TestChromosome;
import org.evosuite.utils.LoggingUtils;
import org.evosuite.utils.Randomness;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Version of the ranking using the quality based preference sorting defined in the paper:
 * Automatic Test Case Generation: What If Code Quality Matters? by Palomba et.al.
 *
 * @author xxx
 */
public class QualityBasedPreferenceSorting<T extends Chromosome> extends RankBasedPreferenceSorting<T> {

    private SmellinessDetector smellinessDetector;

    public QualityBasedPreferenceSorting(SmellinessDetector detector) {
        this.smellinessDetector = detector;
    }

    @Override
    public void computeRankingAssignment(List<T> solutions, Set<FitnessFunction<T>> uncovered_goals) {
        // before to actually do the assignment, we compute the quality score
        for (int i = 0; i < solutions.size(); i++) {
            TestChromosome testChromosome = (TestChromosome) solutions.get(i);
            String solutionSource = testChromosome.getTestCase().toCode();

            List<String> testSuiteCode = new ArrayList<>();
            for (int j=0; j < solutions.size(); j++) {
                if (j != i) {
                    TestChromosome aux = (TestChromosome) solutions.get(j);
                    testSuiteCode.add(aux.getTestCase().toCode());
                }
            }
            // avoid to recalculate cohesion whether it has been already calculated previously
            double cohesion = testChromosome.getCohesion();
            if (Double.isNaN(cohesion)) {
                cohesion = smellinessDetector.evaluateCohesion(solutionSource);
            }
            double coupling = smellinessDetector.evaluateCoupling(solutionSource, testSuiteCode);
            testChromosome.setQuality(cohesion, coupling);
        }
        super.computeRankingAssignment(solutions, uncovered_goals);
    }

    @Override
    @SuppressWarnings("Duplicates")
    protected List<T> getZeroFront(List<T> solutionSet, Set<FitnessFunction<T>> uncovered_goals) {
        Set<T> zero_front = new LinkedHashSet<>(solutionSet.size());
        for (FitnessFunction<T> f : uncovered_goals){
            QualityPreferenceSortingComparator<T> comparator
                    = new QualityPreferenceSortingComparator<>(f);

            T best = null;
            for (T test : solutionSet){
                int flag = comparator.compare(test, best);
                if (flag == -1 || (flag == 0  && Randomness.nextBoolean())){
                    best = test;
                }
            }
            zero_front.add(best);
        }
        List<T> list = new ArrayList<>(zero_front.size());
        list.addAll(zero_front);
        return list;
    }
}
