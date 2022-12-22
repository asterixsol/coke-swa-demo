FROM maven:3.8.6-amazoncorretto-11
RUN echo "Test"
RUN pwd
COPY target/coke-swa-demo-0.0.1-SNAPSHOT.jar swa-middleware.jar
ENTRYPOINT ["java","-jar","/swa-middleware.jar"]