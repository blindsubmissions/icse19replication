package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.ga.Chromosome;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.testcase.TestChromosome;

import java.util.Comparator;

/**
 * Used to implement the preference criterion of the approach described by Palomba et.al in:
 * Automatic Test Case Generation: What If Code Quality Matters?
 */
public class QualityPreferenceSortingComparator< T extends Chromosome> implements Comparator<Object> {

    private FitnessFunction<T> goal;

    public QualityPreferenceSortingComparator(FitnessFunction<T> goal) {
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

        double value1, value2;
        value1 = solution1.getFitness(this.goal);
        value2 = solution2.getFitness(this.goal);
        if (value1 < value2)
            return -1;
        else if (value1 > value2)
            return +1;
        else {
            return compareQuality(solution1, solution2);
        }
    }

    private int compareQuality(TestChromosome t1, TestChromosome t2) {
        if (t1.getQuality() < t2.getQuality())
            return -1;
        else
            return 1;
    }
}
