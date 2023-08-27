FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8081
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]