FROM openjdk:17-alpine
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/springboot-1.0.0.jar
ENTRYPOINT exec java -jar springboot-1.0.0.jar