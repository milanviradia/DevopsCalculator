#BASE IMAGE
FROM openjdk:8-jre-alpine
# make directory under this path 
RUN mkdir /usr/myapp
# copy JAR file into that directory
COPY target/DevopsCalculator-1.0-SNAPSHOT.jar /
# switch to that directory
WORKDIR /usr/myapp
# run application with this command line 
CMD ["java","-cp","DevopsCalculator-1.0-SNAPSHOT.jar","com/milan/calculator/Calculator"]
