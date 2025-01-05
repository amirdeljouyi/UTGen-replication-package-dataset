#!/bin/bash

root_dir="/home/roham/Results-Utestgen/dataset/SF110-new-UTestGen-src"
success_log="/home/roham/Results-Utestgen/dataset/checking_compilation/success-new-UTestGen.log"
failure_log="/home/roham/Results-Utestgen/dataset/checking_compilation/failure-new-UtestGen.log"

#find "$root_dir" -mindepth 1 -maxdepth 1 -type d | while read dir; do
# shellcheck disable=SC2044
for dir in $(find "$root_dir" -mindepth 1 -maxdepth 1 -type d); do
    echo "Running gradle build in $dir"
    cd "$dir" || continue
    gradle build > build.log
#    build_output=$(cat build.log)

    if grep -q 'BUILD FAILED' "$dir/build.log"; then
#        echo "Build failed in $dir" | tee -a "$failure_log"
#        echo "$build_output" >> "$failure_log"
        echo "Build did not succeed in $dir" | tee -a "$failure_log"
    else
        echo "Build succeeded in $dir" | tee -a "$success_log"
    fi
    cd "../"
done

echo "Build process completed."
