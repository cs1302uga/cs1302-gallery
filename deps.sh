#!/bin/bash -e

./compile.sh
DEPS=$(mvn -q exec:exec -Dexec.executable=echo -Dexec.args="%classpath")
jdeps -verbose:class \
      --multi-release 17 \
      -cp ${DEPS} \
      --module-path ${DEPS} \
      target/classes \
    | grep -v Warning
