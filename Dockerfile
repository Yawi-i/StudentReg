# Start with a base image containing Java runtime
FROM openjdk:19
COPY target/classes/ /tmp
WORKDIR /tmp
