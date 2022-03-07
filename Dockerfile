#FROM openjdk:8-jdk-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

FROM maven:3.5-jdk-8 AS build  
COPY . /usr/src/app/
#RUN mvn -T 1C clean install -Dmaven.test.skip -DskipTests -Dmaven.javadoc.skip=true
RUN mvn -f /usr/src/app/pom.xml clean package -Dmaven.test.skip -DskipTests -Dmaven.javadoc.skip=true
#RUN mvn clean
#RUN mvn package -Dmaven.test.skip -DskipTests -Dmaven.javadoc.skip=true
#RUN mvn clean package

FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY --from=build /usr/src/app/target/*.jar /app/app.jar 
#ARG JAR_FILE=/usr/src/app/target/*.jar
#COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
