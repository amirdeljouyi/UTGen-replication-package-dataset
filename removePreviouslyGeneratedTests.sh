#!/bin/bash

BASE_DIR="/home/roham/Results-Utestgen/dataset/SF110-new-res"

find "$BASE_DIR" -name "evosuite-tests" -type d -exec rm -rf '{}' +

echo "Cleanup completed."
