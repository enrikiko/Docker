FROM openjdk:11
COPY target/*.jar /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp
#RUN javac Persona.java
CMD ["java", "-jar", "app.jar"]
