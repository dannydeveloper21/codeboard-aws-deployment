FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-native.jar
ENTRYPOINT ["java", "-jar", "spring-native.jar"]
EXPOSE 80