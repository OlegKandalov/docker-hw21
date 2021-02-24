FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8080
ARG JAR_FILE=docker-hw21-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]