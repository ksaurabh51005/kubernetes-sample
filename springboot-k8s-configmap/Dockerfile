FROM openjdk:8-jre-alpine

#ADD %project.artifactId%-%project.version%.jar app.jar
ENV APP_FILE springboot-k8s-configmap-0.0.1-SNAPSHOT.jar

ENV APP_HOME /app
EXPOSE 8085
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]