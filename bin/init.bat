@echo off
cd ..
echo [INFO] ����eclipse �����ʼ��eclipse ����

call mvn eclipse:clean

call mvn eclipse:eclipse

call mvn clean install -U -Dmaven.test.skip=true

del /Q webapp\WEB-INF\lib\*.*
call mvn  dependency:copy-dependencies -DoutputDirectory=webapp/WEB-INF/lib -DincludeScope=runtime -Dsilent=true -DexcludeGroupIds=jspapi,javax.servlet

echo.
echo.

echo [INFO] eclipse�����Ѿ����ɣ�����eclipse�е�������Ŀ¼
echo.
echo.
echo ================================ ��ʾ=====================================
echo.
echo                         ����ʹ��mavenʱ
echo.
echo                         ����eclipse������M2_REPO����
echo.
echo                         ָ��maven��װĿ¼�µ�repositoryĿ¼
echo.
pause
