FROM openjdk:8-jdk-alpine
MAINTAINER Ivan
ENV secretino ima
RUN mvn clean install
COPY target/jokes.jar jokes.jar
ENTRYPOINT ["java","-jar","/jokes.jar"]