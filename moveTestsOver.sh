#!/bin/bash

utestgen_base="/home/roham/Results-Utestgen/results/2_2024-03-15-08/SF110-new-res"
sf11source_base="/home/roham/Results-Utestgen/dataset/SF110-new-UTestGen-src"

for subfolder in "$utestgen_base"/*/; do
  subfolder_name=$(basename "$subfolder")

  source_path="$utestgen_base/$subfolder_name/evosuite-tests/*"
  destination_path="$sf11source_base/$subfolder_name/src/test/java/"

  if [ ! -d "$destination_path" ]; then
    echo "Creating destination directory: $destination_path"
    mkdir -p "$destination_path"
  fi

  echo "Copying from $source_path to $destination_path"
  cp -R $source_path $destination_path
done

echo "All files have been copied."
