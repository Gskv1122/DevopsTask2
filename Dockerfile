FROM eclipse-temurin:17
COPY target/DevopsTask2.jar DevopsTask2.jar
CMD ["java","-jar","DevopsTask2.jar"]