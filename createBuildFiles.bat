@echo off
setlocal

:: Specify the root directory where the subdirectories are located
set "root_dir=D:\Roham\Roham\IdeaProjects\Results-Utestgen\dataset\SF110-src"

:: Specify the full paths to the original build.gradle and gradle.properties files
set "source_build_gradle=D:\Roham\Roham\IdeaProjects\Results-Utestgen\dataset\build.gradle"
set "source_gradle_properties=D:\Roham\Roham\IdeaProjects\Results-Utestgen\dataset\gradle.properties"

:: Loop over each subdirectory in the root directory and copy the files
for /D %%d in ("%root_dir%\*") do (
    echo Copying build.gradle and gradle.properties to %%d
    copy "%source_build_gradle%" "%%d\"
    copy "%source_gradle_properties%" "%%d\"
)

echo Done.

endlocal
