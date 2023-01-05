FROM openjdk:8-alpine3.9
ADD /target/docker-kotlin-otp.jar docker-kotlin-otp.jar
EXPOSE 8086
ENTRYPOINT ['java','-jar','docker-kotlin-otp.jar']