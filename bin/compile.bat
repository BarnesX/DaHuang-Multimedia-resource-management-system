@echo off

echo [INFO]����ȫ��ģ��
cd ..
call mvn clean install -Dmaven.test.skip=true -U
echo.
echo.
echo [INFO] �������
echo.

pause
