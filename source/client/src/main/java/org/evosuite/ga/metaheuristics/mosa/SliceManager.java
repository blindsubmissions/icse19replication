package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.testcase.statements.Statement;
import org.evosuite.testcase.variable.VariableReference;

import java.util.ArrayList;

public class SliceManager {

    public SliceManager(){

    }

    public void mergeSlice(Slice s1, Slice s2){

        ArrayList<Statement> oldStatement = s1.getStatementsOfSlice();
        ArrayList<VariableReference> oldReference = s1.getVariableReferencesOfSlice();

        oldStatement.addAll(s2.getStatementsOfSlice());
        oldReference.addAll(s2.getVariableReferencesOfSlice());

    }

    public Slice fromArrayListToSlice(ArrayList<Statement> statements){

        Slice slice = new Slice();

        for (Statement s : statements) {

            slice.addStatementToSlice(s);

        }
        return slice;
    }

}
