FROM openjdk:8-jre
MAINTAINER Joey <anhtv010888@gmail.com>

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/spring-eureka-server-0.0.1-SNAPSHOT.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/myservice/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/spring-eureka-server-0.0.1-SNAPSHOT.jar
EXPOSE 8761