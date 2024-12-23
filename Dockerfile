
FROM openjdk:21

COPY target/dockercomposeapp.jar myapp.jar

ENTRYPOINT ["java","-jar","myapp.jar"]
