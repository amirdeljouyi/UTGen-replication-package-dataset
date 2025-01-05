#!/bin/bash

# Define the source directory to search for "evosuite-tests" folders
SOURCE_DIR="$1"

TARGET_FOLDER="../results"
TARGET_NUM_FOLDERS=$(find ${TARGET_FOLDER} -mindepth 1 -maxdepth 1 -type d | wc -l)

if [ $# -lt 2 ]; then
  TARGET_DIR="${TARGET_FOLDER}/${TARGET_NUM_FOLDERS}_$(date '+%Y-%m-%d-%H')"
else
  TARGET_DIR="${TARGET_FOLDER}/${TARGET_NUM_FOLDERS}_$2"
fi

echo "TargetDIR: ${TARGET_DIR}"

IFS=';' read -r -a source_paths <<< "$SOURCE_DIR"

# Iterate over each source path
for SOURCE in "${source_paths[@]}"; do
  # Skip empty strings (which can happen due to trailing semicolons)
  if [[ -z "$SOURCE" ]]; then
      continue
  fi

  # Find directories named "evosuite-tests" and copy them to the target directory
  find "$SOURCE" -type d -name "evosuite-tests" -exec bash -c '
    for dir do
       # Create target directory structure and copy files
       TARGET_PATH="$1/${dir#$SOURCE_DIR/}"
       echo "TARGET Path is: $TARGET_PATH"

       if [[ "$TARGET_PATH" = "$1/$1" ]]; then
           continue
       fi

       mkdir -p "$TARGET_PATH"
       cp -r "$dir" "$(dirname "$TARGET_PATH")"
    done
  ' find-sh "$TARGET_DIR" {} +
done
