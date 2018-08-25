package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.ga.Chromosome;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.utils.Randomness;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Ranks the tests according tot the default MOSA criterion, except for the first rank, when it uses the
 * coverage entropy
 *
 * @author xxx
 */
public class EntropyBasedPreferenceSorting<T extends Chromosome> extends RankBasedPreferenceSorting<T> {

    @Override
    public void computeRankingAssignment(List<T> solutions, Set<FitnessFunction<T>> uncovered_goals) {
        super.computeRankingAssignment(solutions, uncovered_goals);
    }

    @Override
    @SuppressWarnings("Duplicates")
    protected List<T> getZeroFront(List<T> solutionSet, Set<FitnessFunction<T>> uncovered_goals) {
        Set<T> zero_front = new LinkedHashSet<>(solutionSet.size());
        for (FitnessFunction<T> f : uncovered_goals){
            CoverageEntropyPreferenceSortingComparator<T> comparator
                    = new CoverageEntropyPreferenceSortingComparator<>(f);

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
