# CAssess Platform #
Capstone Project for ASU

### Members ###
##### Christopher Moretti #####
##### Sean Bender #####
##### Cesar Avitia #####
##### Pedram Sharif #####
##### Thomas Johnson #####

### Baseline Requirements ###
After cloning the repository, you will need to ensure you have a few items downloaded.  In parenthesis will be versions I utilized.  Lower or higher versions may work just as well, but have not been tested.

 - Java 8
 - Apache Maven (4.0.0)
 - Git (2.11.0.windows.3)

### Baseline Installation Procedure ###
After cloning the project start a new Maven project and select the pom.xml file to begin the Project.

Before running the software the first time you need to run the command

    mvn package 

You can either run the CassessApplication.java file to run the server or you can use the terminal command "mvn spring-boot:run"

After completing this step navigate to:

    http://localhost:8080

To log into the system just user the credentials:

    username: user / password: password

To run WAR file from Tomcat locally, do the following:
1. Delete the content of your Tomcat webapps folder
2. Place the "cassess-0.0.1-SNAPSHOT.war" file into the webapps folder
3. Rename "cassess-0.0.1-SNAPSHOT.war" to "ROOT.war" 
4. Start your Tomcat from the bin directory (startup.bat)
5. Navigate to http://localhost:8080/
