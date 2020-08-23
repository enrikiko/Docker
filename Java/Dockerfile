FROM openjdk:11
COPY target/demo-0.0.1-SNAPSHOT.jar /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp
#RUN javac Persona.java
CMD ["java", "-jar", "app.jar"]
