FROM openjdk:11
EXPOSE 8080
ADD target/otp-api-docker.jar otp-api-docker.jar
ENTRYPOINT ["java","-jar","/otp-api-docker.jar"]