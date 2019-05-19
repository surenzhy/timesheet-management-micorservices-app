# timesheet-management-micorservices-app
Microservices for timesheet management application

Repo contains source code for the microservices used in the timesheet management app as described here --> https://github.com/surenzhy/timesheet-management-aws-deploy

# Code repo & microservices description

This repo contains an application that consists of microservices. The application uses following services:

* auth-service: Microservice for managing authentication & autherization in the application.
* visualize-timesheet-service: A microservice that returns timesheet data for users.
* process-timesheet: A microservice that processes the timesheet uploaded by the users in excel format.
* user-service: A microservice that performs user level operations like add user, update user, delete user etc.
* project-service: A microservice that performs project level operations like add project, add user to project etc.
* discovery-server: Eureka discovery server for discovery of microservices.

Each microservice can be deployed using different AWS Compute options.
