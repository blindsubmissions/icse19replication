## Install qMOSA dependencies

To run the qMOSA algorithm, you have to locally install the qMOSA dependency via MAVEN.

Just type the following command:

```
mvn install:install-file -Dfile=<path to qmosa.jar> -DgroupId=nl.tudelft -DartifactId=qmosa -Dversion=1.0 -Dpackaging=jar
```