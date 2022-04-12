#!/bin/bash -ex

./compile.sh
mvn -q -e -Dprism.order=sw -Dexec.cleanupDaemonThreads=false exec:java
