# 2048-AI-Solver
Server-Client Template For Building the 2048 AI Solver

Here are the step-by-step instructions for setting up the server locally:
* Download Apache Ant: http://ant.apache.org/ and note the path to "ant" executable.
* Go to the project directory, execute: ```<path-to-ant>/ant -f 2048AISolver.xml```
* Now Download Tomcat 8.0: http://tomcat.apache.org/tomcat-8.0-doc/deployer-howto.html. Note down the path to your tomcat executables
* From your project directory, execute: ```cp out/artifacts/WebApp/WebApp.war <path to tomcat>/webapps/WebApp/```
* Now execute <path to tomcat>/bin/catalina.sh run
