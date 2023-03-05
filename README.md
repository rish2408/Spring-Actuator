# Spring-Actuator
- This Spring Actuator application has several packages, classes, and configuration files. Here is an overview of each file and its role in the application.

## Tech Stack

- Core Java
- Spring Framework
- Spring Boot
- Spring Data JPA
- Lombok

## Bean Package
### Employee.java
- This file contains the Employee class, which defines the properties of an employee object, including the employee ID, name, and location.

## Controller Package
### ActuatorController.java
- This file contains the ActuatorController class, which defines a REST endpoint for retrieving application information. The endpoint URL is /actuator/info, and it returns a map of key-value pairs containing the application's version and name.

### EmployeeController.java
- This file contains the EmployeeController class, which defines a REST endpoint for retrieving all employee details. The endpoint URL is /employees, and it returns a list of Employee objects.

## Service Package
### DBHealthChecker.java
- This file contains the DBHealthChecker class, which implements the HealthIndicator interface. The class has a custom method for checking the health of the database service. If the service is running, the health() method returns an up status with the message "Database Service is Running." If the service is down, the method returns a down status with the message "Database Service is Down."

# Configuration Files
## application.properties
- This file contains the configuration properties for the application. The following properties are set in this file:

```
management.endpoints.web.exposure.include=*: Exposes all actuator endpoints through the web interface.
management.endpoint.health.show-details=always: Shows details about the health status of the application.
management.endpoints.web.base-path=/admin: Sets the base path for all actuator endpoints to /admin.

```
## pom.xml
- This file contains the dependencies for the application, including the spring-boot-devtools dependency used for hot reloading during development.

spring-boot-starter-web - This dependency provides the basic web framework for the application.
spring-boot-starter-actuator - This dependency provides the Spring Actuator framework for the application.
lombok - This dependency provides Lombok annotations to reduce boilerplate code.
spring-boot-devtools - This dependency provides tools for development-time reloading of the application.

# Testing the Endpoints
- After running the application, you can test the Actuator endpoints by visiting the following URLs:

```
/actuator/info: Returns version and name of the application.
/actuator/health: Returns health status of the application.
- You can also test the custom /employees endpoint by visiting:
/employees: Returns a list of sample employee details.

```
