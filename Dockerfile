FROM java:8

COPY build/libs/staff-service-0.0.1-SNAPSHOT.jar /app/staff-service.jar
EXPOSE 9527

ENTRYPOINT ["java", "-Dserver.port=9527", "-Dspring.profiles.active=production", "-Dspring.data.mongodb.uri=mongodb://127.0.0.1:27017/thoughtworks", "-jar","/app/staff-service.jar"]