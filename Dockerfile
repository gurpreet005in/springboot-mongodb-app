FROM openjdk:17
ADD /target/springboot-books.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]