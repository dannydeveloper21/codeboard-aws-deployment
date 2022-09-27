FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-native
ENTRYPOINT ["java", "-jar", "spring-native"]
EXPOSE 8761