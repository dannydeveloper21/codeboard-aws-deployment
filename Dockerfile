FROM openjdk:11
EXPOSE 8082
COPY target/*.jar spring-native.jar
ENTRYPOINT ["java", "-jar", "spring-native.jar"]