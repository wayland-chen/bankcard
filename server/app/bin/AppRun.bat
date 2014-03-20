@echo off
setLocal EnableDelayedExpansion
set CLASSPATH="
for /R . %%a in (*.jar) do (
  set CLASSPATH=!CLASSPATH!;%%a
)
set CLASSPATH=!CLASSPATH!"

set ATOMS_DIR="atoms"
set ATOMS_JAR="tradeunit-1.0-SNAPSHOT.jar"

IF EXIST "%JAVA_HOME%" SET JDK=%JAVA_HOME%

SET JAVA_EXE=%JDK%\bin\java.exe
SET JAR_EXE=%JDK%\bin\jar.exe

IF NOT EXIST "%JAR_EXE%" SET JAR_EXE=%JDK%\jre\bin\jar.exe
if exist %ATOMS_DIR% ( rd /s /q %ATOMS_DIR%)

md %ATOMS_DIR%
%JAR_EXE% xvf %ATOMS_JAR%
move com  %ATOMS_DIR%
%JAVA_EXE% -Xmx1024m -server  com.wisdragon.splus.main.AppMain .
