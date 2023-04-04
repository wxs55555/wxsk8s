FROM openjdk:8-jdk-alpine
volume /tmp
ADD ./target/wxsk8s-1.0-SNAPSHOT.jar wxsk8s-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/wxsk8s-1.0-SNAPSHOT.jar","&"]