package org.evosuite.ga.metaheuristics.mosa.comparators;

import org.evosuite.testcase.TestChromosome;
import org.evosuite.testcase.statements.Statement;

import java.util.Comparator;

/**
 * @author xxx.
 */
public class TestQualityComparator implements Comparator<TestChromosome> {
    @Override
    public int compare(TestChromosome t1, TestChromosome t2) {
        int comparation = Double.compare(t1.getEntropy(), t2.getEntropy());

        if (comparation == 0) {
            comparation = Double.compare(t1.getTestCase().size(), t2.getTestCase().size());

            if (comparation == 0) {
                comparation = Integer.compare(t1.getNumberOfVariableReferences(), t2.getNumberOfVariableReferences());
            }
        }

        return comparation;
    }
}
