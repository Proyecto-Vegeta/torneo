FROM openjdk:11

ADD target/torneo-1.0-SNAPSHOT-jar-with-dependencies.jar /root/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/root/app.jar"]