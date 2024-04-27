FROM openjdk:17-jdk-alpine

COPY Indigenous-Language-Dictionary/out/artifacts/Indigenous_Language_Dictionary_jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
