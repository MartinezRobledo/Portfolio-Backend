FROM amazoncorretto:17-alpine-jdk 
MAINTAINER adrianMartinez 
COPY target/APIREST-0.0.1-SNAPSHOT.jar apirest.jar
NAME-YOUR-FILE-BUILDSPRINGBOOT.jar ENTRYPOINT ["java","-jar","/APIREST-0.0.1-SNAPSHOT.jar"] 
