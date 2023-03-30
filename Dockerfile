FROM maven:3.6.3-openjdk-11
WORKDIR /activitytracker-api/Docker-App/activitytracker-api
COPY ./activitytracker-api ./
RUN mvn clean install -Dmaven.test.skip=true
WORKDIR target
EXPOSE 8089
CMD ["java", "-jar", "ActivityTracker-1-0.0.1-SNAPSHOT.jar", "--server.port=8089"]
