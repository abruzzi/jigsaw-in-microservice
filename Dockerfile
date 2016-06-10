FROM java:8

ADD build/libs/staff-service-1.0.0.jar /app/staff-service.jar
EXPOSE 9527

ENTRYPOINT ["java", "-jar","/app/staff-service.jar"]
