@ECHO OFF

set TARGET_DIR=".\target"
set MAIN_APP=".\src\main\com\example\MainApplication.java"
set PACKAGE1_DIR=".\src\main\com\example\package1"
set PACKAGE2_DIR=".\src\main\com\example\package2"

javac %PACKAGE1_DIR%\*.java -d %TARGET_DIR%
javac %PACKAGE2_DIR%\*.java -d %TARGET_DIR%
javac -cp ".;%TARGET_DIR%" %MAIN_APP% -d %TARGET_DIR%

ECHO compiled src
ECHO continue to run

PAUSE

java -cp %TARGET_DIR% MainApplication