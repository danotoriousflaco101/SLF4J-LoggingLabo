<div align="center">
<h1><strong>Spring Boot Logging Demo: The Skate Shop 🛹</strong></h1>
<img src="https://upload.wikimedia.org/wikipedia/commons/6/6b/SLF4J_Logo.jpg" alt="debugging" width="500"/>
</div>

<div align="center">
</br>
This repository is a project designed to master professional logging practices in a Spring Boot application</br> using <strong>SLF4J</strong> and Logback. 
</br>
</br>
</div>
</br>


🎯 Learning Goals
---------
</br>
The main objective was to transition from "Print Debugging" (System.out.println) to a more professional logging solution.
</br>
</br>

<strong>Key Concepts Implemented:</strong>
</br>
</br>
SLF4J + Lombok: Using the @Slf4j annotation to inject loggers reducing boilerplate code.
</br>
</br>
<strong>Log Levels:</strong> Understanding when to use specific levels:
</br>
</br>
INFO: Standard business events (like "Order received").

DEBUG: Technical details for developers (like "Checking inventory...").

WARN: Potential issues that don't stop the app ("Low quality parts selected").

ERROR: Critical failures ("Missing parts").
</br>
</br>


Tech Stack 🛠️
-----
</br>
<strong>Java 21:</strong> The core programming language.
</br>
</br>
This project feats a full Java app made withSpring Boot framework as i've focused on the standard SLF4J library.
</br>
<strong>Spring Boot:</strong> The main framework for building the application
</br>
<strong>SLF4J Library:</strong> Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks (i.e. java.util.logging, logback, log4j) allowing the end user to plug in the desired logging framework at deployment time.
</br>
<strong>Lombok:</strong> To reduce boilerplate code.
</br>
</br>

Tools & Technologies 💻
------------
</br>
<p align="center">
<a href="#"><img src="https://img.shields.io/badge/Apache%20Maven-C71A36?logo=apachemaven&logoColor=white" alt="Maven"></a>
<a href="#"><img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?logo=springboot&logoColor=fff&style=flat" alt="SpringBoot"></a>
<a href="#"><img src="https://img.shields.io/badge/macOS-000000?logo=apple&logoColor=F0F0F0" alt="macOS"></a>
<a href="#"><img src="https://img.shields.io/badge/Spotify-1ED760?logo=spotify&logoColor=white" alt="Spotify"></a> 
<a href="#"><img src="https://custom-icon-badges.demolab.com/badge/Visual%20Studio%20Code-0078d7.svg?logo=vsc&logoColor=white" alt="VSC"></a>
<a href="#"><img src="https://img.shields.io/badge/GitHub-181717?logo=github&logoColor=white" alt="GitHub"></a> 
</p>
</br>


How It Works 🛠️
----
</br>
The application exposes a REST API to assemble a skateboard setup.
</br>
</br>
<strong>The Controller (SkateController)</strong>
</br>
</br>
Handles HTTP requests and logs the entry/exit points.

Log: INFO "API Called: GET /assemble..."
</br>
</br>
<strong>The Service (SkateShopService)</strong>
</br>
</br>
Contains the business logic and logging examples.

Scenario 1 (Success): Logs the assembly steps.

Scenario 2 (Error): If deck or trucks are missing, it logs an ERROR.

Scenario 3 (Warning): If the user selects "SuboptimalBearings", it logs a WARN.
</br>
</br>

How to Run 🚀
------
</br>

Clone the repository and run it with Maven:
</br>
<strong>./mvnw spring-boot:run</strong>
</br>

Test the API (Browser or Postman/Insomnia):

Standard Assembly (INFO logs):
http://localhost:8080/assemble?deck=Baker&wheels=Spitfire&trucks=Thunder&bearings=Bones&grip=Mob

Trigger a Warning (WARN logs):
http://localhost:8080/assemble?deck=SantaCruz&wheels=Spitfire&trucks=Indy&bearings=Reds&grip=Mob

Trigger an Error (ERROR logs):
http://localhost:8080/assemble?deck=&wheels=Spitfire&trucks=Indy&bearings=Bones&grip=Mob
</br>
</br>

Configuration (application.properties) ⚙️
-------
</br>

To see DEBUG logs (which are hidden by default in Spring Boot) i've included this:

<strong>Enable DEBUG logs</strong>
</br>
logging.level.com.flaco.spring_logging_demo=DEBUG
