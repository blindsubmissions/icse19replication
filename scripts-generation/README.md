# Generate Tests 

## Prerequisites

Download from the EvoSuite website the SF110 benchmark (both the jar version and the source version).

```
wget http://www.evosuite.org/files/SF110-20130704.zip
wget http://www.evosuite.org/files/SF110-20130704-src.zip
```

Unzip and rename the folder with the jars as `project` and the other as `SF110`.
Place them in this same directory.

## How to run

User the following command to select the type of approach(es)to use for the generation.

> ./generate.sh 1000 1030 10

will generate 30 runs for the chosen criterion with 10 parallel runs.

Once this command is executed, a menu appears end you need to select the version(s).

The user has to choose 1 or more combination he wants to run.
If you want to run more than once, just use the command to separate the various numbers.

Then, the `run.sh` script will be created to execute the experiment with the chosen configuration. 
