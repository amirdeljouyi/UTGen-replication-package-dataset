#!/bin/bash

# Specify the base directory here
baseDirectory="/home/roham/Results-Utestgen/dataset/SF110-new-UTestGen-src"
# Output CSV file for aggregated results
outputCSV="/home/roham/Results-Utestgen/dataset/aggregated-jacoco-results-new-UTestGen.csv"

# Initialize the output file and ensure it's empty
> "$outputCSV"

# Variable to track if the first file (header included)
firstFile=1

# Find jacocoTestReport.csv files and process them
find "$baseDirectory" -type f -name "jacocoTestReport.csv" -print0 | while IFS= read -r -d $'\0' file; do
    if [ "$firstFile" -eq 1 ]; then
        # For the first file, copy as is to include the header
        cat "$file" > "$outputCSV"
        firstFile=0
    else
        # For subsequent files, skip the header (assumed to be the first line) and append
        awk 'NR > 1' "$file" >> "$outputCSV"
    fi
done

echo "Aggregated results have been saved to $outputCSV."

