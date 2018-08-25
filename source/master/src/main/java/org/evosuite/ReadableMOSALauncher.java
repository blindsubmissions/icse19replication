package org.evosuite;

/**
 * @author xxx
 * Utility class to launch and test the implemented version of ReadableMOSA
 */
public class ReadableMOSALauncher {
    public static void main(String[] args) {

        String[] command = {
                "-generateMOSuite",
                "-Dcriterion=BRANCH",
                "-Dconfiguration_id=test",
                "-Djunit_check=false",
                "-Dminimize=FALSE",
                "-Dpopulation=50",
//                RMOSA is the temporary name for the modified version of MOSA we implement optimized for readability
                "-Dalgorithm=QMOSA",
                "-Dcoverage=TRUE",
                "-Dsandbox=TRUE",
                "-Dassertions=FALSE",
                "-Dsearch_budget=30",
                /** ranking type set to ENTROPY_SORTING uses the coverage entropy in the preference criterion*/
                "-Dranking_type=ENTROPY_SORTING",
                /** this flag printes the entropy coverage in test comments; at the moment is not compatible with the
                 * normal flag used for the comments*/
                "-Dentropy_comments=true",
                /** this flag handles the usage of test cases from slicing*/
                "-Dslicing=true",
//                if true, allows you to debug the client part (executed on the same JVM)
                "-Dclient_on_thread=false",
                "-Doutput_variables=TARGET_CLASS,criterion,configuration_id,algorithm,Total_Goals,Covered_Goals," +
                        "Generations,Statements_Executed,Fitness_Evaluations,Tests_Executed,Generations,Total_Time," +
                        "Size,Result_Size,Length,Result_Length,BranchCoverage,CoverageEntropy",
                "-projectCP",
                "/Users/xxx/IdeaProjects/evo_performance/Dataset/projects/3_gson/gson-2.8.1-SNAPSHOT.jar",
                "-class",
                "com.google.gson.stream.JsonReader",
                "-DsourcePath",
                "/Users/xxx/Desktop/JsonReader.java"

        };

        EvoSuite.main(command);
    }
}