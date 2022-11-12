FROM openjdk:11
EXPOSE 9000
COPY target/*.jar spring-native.jar
ENTRYPOINT ["java", "-jar", "spring-native.jar"]