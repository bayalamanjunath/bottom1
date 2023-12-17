# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar /app
# Expose port 8080 to the outside world
EXPOSE 8081

# Specify the command to run on container start
CMD ["java", "-jar", "spring-boot-2-hello-world-1.0.2-SNAPSHOT.jar"]
