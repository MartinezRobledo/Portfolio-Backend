FROM amazoncorretto:17-alpine-jdk 
MAINTAINER MartinezRobledo 
COPY target/APIREST-0.0.1-SNAPSHOT.jar  apirest-app.jar
ENTRYPOINT ["java","-jar","/APIREST-0.0.1-SNAPSHOT.jar"] 
