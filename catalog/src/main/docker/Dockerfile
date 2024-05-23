FROM openjdk:19

RUN mkdir /opt/bin

COPY target/catalog*.jar /opt/bin/catalog.jar

WORKDIR /opt/bin

EXPOSE 9091

CMD ["java", "-jar", "catalog.jar"]

