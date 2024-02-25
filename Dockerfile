FROM openjdk:17
COPY ./target/Project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Project-1.0-SNAPSHOT.jar", "org.example.Main"]