FROM openjdk:17-jdk

ADD target/Indigenous-Language-Dictionary-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
