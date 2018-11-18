@echo on
@echo =============================================================
@echo $                                                           $
@echo $                      plugin-base                          $
@echo $                                                           $
@echo =============================================================
@echo.
@echo off

@title plugin-base version update
@color 0a

rem  Please execute command in local directory.

call mvn -N versions:update-child-modules
call mvn versions:set -DnewVersion=1.0.0
call mvn versions:commit

pause