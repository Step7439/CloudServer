#FROM adoptopenjdk/openjdk:17-oracle
FROM openjdk:17-oracle

EXPOSE 8080

ADD target/Cloud-0.0.1-SNAPSHOT.jar cloud.jar

ENTRYPOINT ["java","-jar","/cloud.jar"]