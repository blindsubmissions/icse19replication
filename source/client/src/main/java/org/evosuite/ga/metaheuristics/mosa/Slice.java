package org.evosuite.ga.metaheuristics.mosa;


import org.evosuite.testcase.statements.Statement;
import org.evosuite.testcase.variable.VariableReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author xxx
 *
 * Slice is an indipendent piece of a test case
 *
 */

public class Slice {

    private ArrayList<Statement> statementsOfSlice = new ArrayList<>();
    private ArrayList<VariableReference> variableReferencesOfSlice = new ArrayList<>();

    public Slice() {
    }

    /*

     */
    public Slice(Statement statement) {

        this.statementsOfSlice.add(statement);
        this.addVariableReferences(statement);

    }

    public boolean statementIsPresent(Statement statement){

        boolean isPresent = false;

        if (this.statementsOfSlice.contains(statement)){
            isPresent = true;
        }
        return isPresent;
    }

    public void addManyStatementsToSlice(ArrayList<Statement> statementsToAdd){
        this.statementsOfSlice.addAll(statementsToAdd);
        for (Statement s : statementsToAdd) {
            this.variableReferencesOfSlice.addAll(s.getUniqueVariableReferences());
        }
    }

    public void addStatementToSlice(Statement statement) {
        this.statementsOfSlice.add(statement);
        this.addVariableReferences(statement);
    }

    public ArrayList<Statement> getStatementsOfSlice() {
        return statementsOfSlice;
    }

    public void setStatementsOfSlice(ArrayList<Statement> statementsOfSlice) {
        this.statementsOfSlice = statementsOfSlice;
    }

    public ArrayList<VariableReference> getVariableReferencesOfSlice() {
        return variableReferencesOfSlice;
    }

    public void setVariableReferencesOfSlice(ArrayList<VariableReference> variableReferencesOfSlice) {
        this.variableReferencesOfSlice = variableReferencesOfSlice;
    }

    private void addVariableReferences(Statement statement) {
        for (VariableReference vr : statement.getUniqueVariableReferences()) {
            this.variableReferencesOfSlice.add(vr);
        }
    }

    public boolean isContained(List<VariableReference> variableReferences){
        for (VariableReference vr: this.getVariableReferencesOfSlice()) {
            if (variableReferences.contains(vr)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> sliceSequence (){
        ArrayList<Integer> seq = new ArrayList<>();
        for (Statement s : this.getStatementsOfSlice()) {
            seq.add(s.getPosition());
        }
        return seq;
    }

    public void merge(Slice other) {
        this.statementsOfSlice.addAll(other.statementsOfSlice);
    }

    public void merge(Collection<Slice> slices) {
        for (Slice slice : slices) {
            this.merge(slice);
        }
    }

    @Override
    public String toString() {
        return " Slice{" +
                "\nstatementsOfSlice=" + this.sliceSequence() +
                "\n, variableReferencesOfSlice=" + variableReferencesOfSlice +
                '}';
    }
}
