#!/bin/bash

initial_subdir='D:\Roham\Roham\IdeaProjects\Results-Utestgen\results\0_2024-03-03-15\SF110'
target_dir='D:\Roham\Roham\IdeaProjects\Results-Utestgen\dataset\SF110-src'


for subdir in "$target_dir"/*; do
    if [ -d "$subdir" ]; then
        subdir_name=$(basename "$subdir")

        if [ ! -d "$initial_subdir/$subdir_name" ]; then
            # If it doesn't exist in the initial subdirectory, delete it from the target directory
            echo "Deleting $subdir"
            rm -rf "$subdir"
        fi
    fi
done

echo "Cleanup complete."