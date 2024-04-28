#FROM ubuntu:latest
#LABEL authors="naimur"
#
#ENTRYPOINT ["top", "-b"]



# Use a base image with Java installed
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file to the container
COPY target/Indigenous-Language-Dictionary-0.0.1-SNAPSHOT.jar app.jar


# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Specify the command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
