FROM openjdk:17
EXPOSE 8080
ADD target/SampleRestApi.jar SampleRestApi.jar
ENTRYPOINT ["java","-jar", "SampleRestApi.jar"]
