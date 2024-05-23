FROM openjdk:19

RUN mkdir /opt/bin

COPY target/client*.jar /opt/bin/client.jar

WORKDIR /opt/bin

EXPOSE 9092

ENTRYPOINT ["java", "-jar"]
CMD ["client.jar"]
