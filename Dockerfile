FROM openjdk:11
ADD target/*.jar spring-native
ENTRYPOINT ["java", "-jar", "spring-native"]
EXPOSE 8761