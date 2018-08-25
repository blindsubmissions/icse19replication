package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.ga.Chromosome;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.ga.metaheuristics.mosa.comparators.TestQualityComparator;
import org.evosuite.testcase.TestChromosome;

import java.util.Comparator;

/**
 * Used to implement the PreferenceCriterion using the coverage entropy as a secondary objective
 * @param <T> a TestSuiteChromosome object
 *
 * @author xxx
 */
public class CoverageEntropyPreferenceSortingComparator< T extends Chromosome> implements Comparator<Object> {

    private FitnessFunction<T> goal;

    public CoverageEntropyPreferenceSortingComparator(FitnessFunction<T> goal) {
        this.goal = goal;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == null)
            return 1;
        else if (o2 == null)
            return -1;

        TestChromosome solution1 = (TestChromosome) o1;
        TestChromosome solution2 = (TestChromosome) o2;

        TestQualityComparator comparator = new TestQualityComparator();

        double value1, value2;
        value1 = solution1.getFitness(this.goal);
        value2 = solution2.getFitness(this.goal);
        if (value1 < value2)
            return -1;
        else if (value1 > value2)
            return +1;
        else {
            // todo: substitute with comparator
            return comparator.compare(solution1, solution2);
        }
    }
}
