FROM openjdk:17
ADD ./target/aws-0.0.1-SNAPSHOT.jar aws-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/aws-1.0.jar"]