FROM adoptopenjdk/openjdk11:alpine-slim
ADD target/*.jar spring-native
ENTRYPOINT ["java", "-jar", "spring-native"]
EXPOSE 8761