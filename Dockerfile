

#
# Build stage
#
FROM maven:3.2.5-jdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/Indigenous-Language-Dictionary-0.0.1-SNAPSHOT.jar Indigenous-Language-Dictionary.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","Indigenous-Language-Dictionary.jar"]