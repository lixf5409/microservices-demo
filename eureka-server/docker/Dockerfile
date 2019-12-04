
FROM java:8-jre
MAINTAINER ChengQianPeng <cwezpeng@163.com>
WORKDIR /opt
COPY target/eureka-server-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]