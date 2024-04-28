FROM openjdk:17-jdk

COPY target/Indigenous-Language-Dictionary-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

