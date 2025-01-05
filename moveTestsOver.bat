@echo off
setlocal enabledelayedexpansion

set "utestgen_base=D:\Roham\Roham\IdeaProjects\Results-Utestgen\results\0_2024-03-03-15\SF110"
set "sf11source_base=D:\Roham\Roham\IdeaProjects\Results-Utestgen\dataset\SF110-src"

for /D %%s in ("%utestgen_base%\*") do (
  set "subfolder_name=%%~nxs"

  set "source_path=!utestgen_base!\!subfolder_name!\evosuite-tests\*"
  set "destination_path=!sf11source_base!\!subfolder_name!\src\test\java\"

  if not exist "!destination_path!" (
    echo Creating destination directory: !destination_path!
    mkdir "!destination_path!"
  )

  echo Copying from !source_path! to !destination_path!
  xcopy /S /I "!source_path!" "!destination_path!"
)

echo All files have been copied.
