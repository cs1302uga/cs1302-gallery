#!/bin/bash -e

./compile.sh
DEPS=$(mvn -q exec:exec -Dexec.executable=echo -Dexec.args="%classpath")
jdeps -verbose:class \
      --multi-release 17 \
      -cp ${DEPS} \
      --module-path ${DEPS} \
      target/classes \
    | grep -v Warning

echo ""
echo "Checking for openStream()..."
if grep -R "\.openStream" src; then
    echo "Per the project description, use of the openStream() method"
    echo "provided by java.net.URL is not allowed."
fi

echo ""
echo "Checking for JsonArray, JsonElement, JsonObject, and JsonParser..."
if grep -R -E "Json(Array|Element|Object|Parser)" src; then
    echo "Per the project description, use of JsonArray, JsonElement,"
    echo "JsonObject, and JsonParser is not allowed."
fi
