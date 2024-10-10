

FROM openjdk:17

MAINTAINER "Mahadev <mahadev@avecircle.com>"

WORKDIR /usr/app/

COPY target/sbapp.jar  /usr/app/

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "sbapp.jar"]

