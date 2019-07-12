FROM openjdk:8u212-jdk
VOLUME /tmp
ADD weixin-java-mp-demo-springboot-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
