#!/bin/bash

root_dir="/home/roham/Results-Utestgen/dataset/SF110-src"

# Content to add to build.gradle
gradle_content='plugins {
    id '\''com.github.johnrengelman.shadow'\'' version '\''7.1.2'\''
    id '\''java'\''
    id '\''idea'\''
    id '\''jacoco'\''
}

group = '\''org'\''
version = '\''0.0.1-SNAPSHOT'\''
sourceCompatibility = '\''8'\''

repositories {
    mavenCentral()
}

compileJava {

}

dependencies {
    implementation fileTree(dir: '\''lib'\'', include: ['\''*.jar'\''])
    implementation fileTree(dir: '\''test-lib'\'', include: ['\''*.jar'\''])

    testImplementation fileTree(dir: '\''../lib'\'', include: ['\''*.jar'\''])
    testImplementation '\''org.junit.jupiter:junit-jupiter-api:5.8.1'\''
    testRuntimeOnly '\''org.junit.jupiter:junit-jupiter-engine:5.8.1'\''
    testCompileOnly '\''junit:junit:4.12'\''
    testRuntimeOnly '\''org.junit.vintage:junit-vintage-engine:5.8.1'\''
}

test {
    useJUnitPlatform()
    finalizedBy jacocoTestReport
    ignoreFailures = true
}

jacocoTestReport {
    reports {
        html.required = true
        xml.required = false
        csv.required = true
    }
}'

find "$root_dir" -mindepth 1 -maxdepth 1 -type d | while read dir; do
    echo "Adding build.gradle to $dir"
    echo "$gradle_content" > "$dir/build.gradle"
    echo "org.gradle.daemon=false" > "$dir/gradle.properties"
done

echo "Done."


#find "$root_dir" -type f -name 'build.gradle' | while read file; do
#    echo "Deleting $file"
#    rm "$file"
#done
#
#echo "All build.gradle files have been deleted."
