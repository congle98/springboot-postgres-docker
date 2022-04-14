FROM openjdk:17
ADD build/libs/springboot-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]