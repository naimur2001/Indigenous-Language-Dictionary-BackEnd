## Use a base image that includes Java runtime
#FROM adoptopenjdk/openjdk11:alpine-jre
#
## Set the working directory inside the container
#WORKDIR /app
#
## Copy the JAR file built by Maven into the container
#COPY target/Indigenous-Language-Dictionary-0.0.1-SNAPSHOT.jar app.jar
#
## Specify the command to run your Spring Boot application
#CMD ["java", "-jar", "app.jar"]


FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY target/Indigenous-Language-Dictionary-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
