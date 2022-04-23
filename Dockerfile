FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","-Dspring.datasource.url=jdbc:mysql://172.17.0.2:3306/patient","/app.jar"]