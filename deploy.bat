@echo on
@echo =============================================================
@echo $                                                           $
@echo $                      plugin-base                          $
@echo $                                                           $
@echo =============================================================
@echo.
@echo off

@title plugin-base deploy
@color 0a

rem  Please execute command in local directory.

call mvn clean deploy -DskipTests -P release

pause