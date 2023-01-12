@ECHO OFF

set TARGET_DIR_CLASSES=".\target\classes"
set MAIN_APP=".\src\main\com\example\MainApplication.java"
set PACKAGE1_DIR=".\src\main\com\example\package1"
set PACKAGE2_DIR=".\src\main\com\example\package2"

javac %PACKAGE1_DIR%\*.java -d %TARGET_DIR_CLASSES%
javac %PACKAGE2_DIR%\*.java -d %TARGET_DIR_CLASSES%
javac -cp ".;%TARGET_DIR%" %MAIN_APP% -d %TARGET_DIR_CLASSES%

ECHO \n compiled src
ECHO continue to compile test \n

set TARGET_DIR_TESTS=".\target\test-classes"
set MAIN_TEST_APP=".\src\test\com\example\MainApplicationTests.java"
set PACKAGE1_TEST_DIR=".\src\test\com\example\package1"
set PACKAGE2_TEST_DIR=".\src\test\com\example\package2"


javac %PACKAGE1_TEST_DIR%\*.java -d %TARGET_DIR_TESTS%
javac %PACKAGE2_TEST_DIR%\*.java -d %TARGET_DIR_TESTS%
javac -cp ".;%TARGET_DIR%" %MAIN_APP% -d %TARGET_DIR_TESTS%

ECHO \n compiled test
ECHO continue to run MainApplication \n

PAUSE

java -cp %TARGET_DIR% MainApplication

ECHO \n ran MainApplication
ECHO continue to run tests \n

PAUSE