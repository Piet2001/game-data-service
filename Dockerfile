FROM openjdk:11
MAINTAINER firestationquiz
COPY target/game-data-service-0.0.1.jar data-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/data-service-0.0.1.jar"]