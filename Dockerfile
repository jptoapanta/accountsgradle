FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
VOLUME /tmp
COPY build/libs/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]