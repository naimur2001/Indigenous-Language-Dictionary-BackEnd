FROM openjdk:17-jdk

COPY target/Indigenous-Language-Dictionary-0.0.1-SNAPSHOT.jar /app/Indigenous-Language-Dictionary.jar

CMD ["java -jar Indigenous-Language-Dictionary.jar"]

