# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

# Refer to Maven build -> finalName
ARG JAR_FILE=build/libs/Arceus-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]