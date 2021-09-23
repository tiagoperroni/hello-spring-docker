FROM openjdk

WORKDIR /app

COPY target/hello-0.0.1-SNAPSHOT.jar /app/hello-app.jar

ENTRYPOINT ["java","-jar","hello-app.jar"]
