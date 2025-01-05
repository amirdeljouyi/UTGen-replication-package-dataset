#!/bin/bash

BASE_DIR="/home/roham/Results-Utestgen/dataset/SF110-new-ES-src"

# find "$BASE_DIR" -name "evosuite-files" -type d -exec rm -rf '{}' +
# find "$BASE_DIR" -name "evosuite-tests" -type d -exec rm -rf '{}' +
#find "$BASE_DIR" -name ".gradle" -type d -exec rm -rf '{}' +
#find "$BASE_DIR" -name "build" -type d -exec rm -rf '{}' +
# find "$BASE_DIR" -name "build.xml" -type f -exec rm -f '{}' +
# find "$BASE_DIR" -name "*_ESTest.java" -type f -exec rm -rf '{}' +
# find "$BASE_DIR" -name "*_ESTest_scaffolding.java" -type f -exec rm -rf '{}' +
# find "$BASE_DIR" -path "*/src/main/java/**/*Test*.java" -type f -exec rm -f '{}' +
#find "$BASE_DIR" -path "*/src/test/java/**/*_Original_ESTest.java" -type f -exec rm -f '{}' +
#find "$BASE_DIR" -path "*/src/test/java/**/*_Original_ESTest_scaffolding.java" -type f -exec rm -f '{}' +

find "$BASE_DIR" -type f -name "*ESTest.java" | grep -v "_Original_ESTest.java" | xargs rm -f
find "$BASE_DIR" -type f -name "*ESTest_scaffolding.java" | grep -v "_Original_ESTest_scaffolding.java" | xargs rm -f


echo "Cleanup completed."
