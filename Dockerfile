FROM openjdk:21-ea-1-jdk

WORKDIR /app

COPY ./target/spring-boot-0.0.1-SNAPSHOT.jar springbootapp.jar

ENTRYPOINT ["java", "-jar","springbootapp.jar"]