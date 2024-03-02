FROM openjdk:17
COPY ./target/Project-1.0-SNAPSHOT.jar /app/Project-1.0-SNAPSHOT.jar
WORKDIR /app
CMD ["java", "-jar", "Project-1.0-SNAPSHOT.jar", "org.example.Main"]