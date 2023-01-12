@ECHO OFF

set TARGET_DIR_CLASSES=".\target\classes"
set MAIN_APP=".\src\main\com\example\MainApplication.java"
set PACKAGE1_DIR=".\src\main\com\example\package1"
set PACKAGE2_DIR=".\src\main\com\example\package2"

javac %PACKAGE1_DIR%\*.java -d %TARGET_DIR_CLASSES%
javac %PACKAGE2_DIR%\*.java -d %TARGET_DIR_CLASSES%
javac -cp ".;%TARGET_DIR_CLASSES%" %MAIN_APP% -d %TARGET_DIR_CLASSES%

ECHO.
ECHO compiled src
ECHO continue to compile test
ECHO.

PAUSE

set MAIN_TEST_APP=".\src\test\com\example\MainApplicationTests.java"
@REM set PACKAGE1_TEST_DIR=".\src\test\com\example\package1"
@REM set PACKAGE2_TEST_DIR=".\src\test\com\example\package2"
@REM
@REM
@REM javac %PACKAGE1_TEST_DIR%\*.java -d %TARGET_DIR_TESTS%
@REM javac %PACKAGE2_TEST_DIR%\*.java -d %TARGET_DIR_TESTS%
javac -cp ".;%TARGET_DIR_CLASSES%;%TARGET_DIR_TESTS%;" %MAIN_TEST_APP% -d %TARGET_DIR_TESTS%

ECHO.
ECHO compiled test
ECHO continue to run MainApplication
ECHO.

PAUSE

java -cp %TARGET_DIR_CLASSES% com.example.MainApplication

ECHO.
ECHO ran MainApplication
ECHO continue to run tests
ECHO.

PAUSE

java -cp "%TARGET_DIR_TESTS%;%TARGET_DIR_CLASSES%" com.example.MainApplicationTests