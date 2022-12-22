FROM maven:3.8.6-amazoncorretto-11
COPY target/coke-swa-demo-0.0.1-SNAPSHOT.jar swa-middleware.jar
ENTRYPOINT ["java","-jar","/swa-middleware.jar"]
