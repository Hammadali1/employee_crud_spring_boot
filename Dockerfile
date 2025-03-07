# Use a base image with Java 17
FROM openjdk:17

# Set the working directory inside the container
EXPOSE 8082

# Copy the JAR file into the container
COPY target/employee-crud-app.jar employee-crud-app.jar

# Expose the port the app runs on
#EXPOSE 8082

#LABEL authors="Hammad"

# Command to run the application
ENTRYPOINT ["java", "-jar", "/employee-crud-app.jar"]

