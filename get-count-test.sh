#!/bin/bash

rootDirectory="/home/roham/Results-Utestgen/dataset/SF110-new-UTestGen-src"

cd "$rootDirectory" || exit

totalTests=0
revertedTests=0
noCommentTests=0

for subdir in */ ; do
    if [ -d "${subdir}src/test" ]; then
        count=$(find "${subdir}src/test" -type f -name "*_ESTest.java" -exec grep -oh "@Test" {} + | wc -l)
        countReverts=$(find "${subdir}src/test" -type f -name "*_ESTest.java" -exec grep -oh "// rollbacked to evosuite" {} + | wc -l)
        countComments=$(find "${subdir}src/test" -type f -name "*_ESTest.java" -exec grep -oh "// No Comments were added" {} + | wc -l)
        echo "${subdir}src/test: $count tests , $countReverts reverted tests, $countComments no-comment lines"
        totalTests=$((totalTests + count))
        revertedTests=$((revertedTests + countReverts))
        noCommentTests=$((noCommentTests + countComments))

    fi
done

echo "Total tests: $totalTests , reverted tests: $revertedTests , uncommented tests: $noCommentTests"
