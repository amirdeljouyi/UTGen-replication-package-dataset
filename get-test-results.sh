#!/bin/bash

baseDirectory="/home/roham/Results-Utestgen/dataset/SF110-new-UTestGen-src"
outputCSV="/home/roham/Results-Utestgen/dataset/test_results_summary_new_UTestGen.csv"

echo "Subdirectory,Total Tests,Failures,Ignored,Success Rate" > "$outputCSV"

extract_data() {
    local filePath=$1
    local basePath=$2

    local subdir=${filePath#${basePath}/}
    subdir=${subdir%/build/reports/tests/test/index.html}
    
    totalTests=$(sed -n '/<div class="infoBox" id="tests">/{:a;N;/<div class="counter">[0-9]*<\/div>/!ba;s/.*<div class="counter">\([0-9]*\)<\/div>.*/\1/p}' "$filePath")
    failures=$(sed -n '/<div class="infoBox" id="failures">/{:a;N;/<div class="counter">[0-9]*<\/div>/!ba;s/.*<div class="counter">\([0-9]*\)<\/div>.*/\1/p}' "$filePath")
    ignored=$(sed -n '/<div class="infoBox" id="ignored">/{:a;N;/<div class="counter">[0-9]*<\/div>/!ba;s/.*<div class="counter">\([0-9]*\)<\/div>.*/\1/p}' "$filePath")
    successRate=$(sed -n 's/.*<div class="percent">\([0-9]*\)%<\/div>.*/\1/p' "$filePath")

    echo "$subdir, $totalTests, $failures, $ignored, $successRate"

    echo "$subdir,$totalTests,$failures,$ignored,$successRate" >> "$outputCSV"
}

export -f extract_data
export baseDirectory
export outputCSV

cd "$baseDirectory" || exit

find . -type f -name "index.html" -path "*/build/reports/tests/test/index.html" -exec bash -c 'extract_data "$0" "$1"' {} "$(pwd)" \;

echo "Results have been saved to $outputCSV."
