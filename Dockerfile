# Use official JDK 21 slim image
FROM openjdk:21-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the built JAR into the container
COPY target/*.jar app.jar

# Expose the app port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

#changed password  in git hub
# Repository secrets