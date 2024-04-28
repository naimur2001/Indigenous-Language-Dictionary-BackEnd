FROM openjdk:17-jdk-alpine

COPY /home/naimur/Downloads/javaApiFiles/Indigenous-Language-Dictionary/out/artifacts/Indigenous_Language_Dictionary_jar/Indigenous-Language-Dictionary.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
