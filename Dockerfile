# Use a Maven image as the builder stage
FROM maven:3.8.5-openjdk-17-slim as builder

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY ./pom.xml ./pom.xml
COPY ./src ./src/

# Build the Maven project
RUN mvn clean package -DskipTests

# Use a lightweight JDK image for the runtime stage
FROM  openjdk:17-jdk-slim


# Set the working directory
WORKDIR /app

# Copy the compiled JAR file from the builder stage
COPY --from=builder /app/target/*.jar ./app.jar

# Expose the port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
