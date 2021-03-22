## JavaServer Faces with Spring Boot

Introduction
=================================================================
This implemetation performs CRUD operations using java with springboot technology and implementing front end with Java Server faces (JSF). Its meat to serve as training for whoever may be interested in using springboot for the developemtnent of backend and JSF for front end with H2 in-memory integration.


Technology
==================================================================
- Java 8
- JSF (Primefaces 6)
- Springboot
- Maven 3
- H2 In-Memory Database.
- TomCat


SetUp
====================================================================
- Clone the codebase form the repsitory to your local environment with the following command: https://github.com/olusegun-emmanuel/TCSAssignment2.git
- Run maven commands to clean and install the application. This is will ensude dependencied used in the application is downloded and installsed the command is: mvn clean install
- Run the application with the following command : mvnw spring-boot:run
- The application uses embeded Tomcatand its configured to run on port 8080. (Please ensure this port is available and not in use by any other applicatioln).
- When application is running, open your browser and type the url http://localhost:8080/ From the base page loaded you will be able to use the links to add, list and modify developer information.
