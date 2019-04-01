# Pull base image.
FROM ubuntu:18.04

RUN apt-get update
RUN apt update
RUN apt-get install tree
RUN apt-get install locate
RUN updatedb
RUN apt-get -y install man
RUN apt update
RUN apt install -y python3-pip
RUN pip3 install awscli --upgrade --user
RUN apt install -y curl
RUN apt install wget

WORKDIR /tmp/selenium
#RUN curl -L https://bit.ly/2TlkRyu > ./seleniumServer.zip
COPY ./seleniumServer.zip ./seleniumServer.jar
COPY ./chromedriver ./chromedriver

RUN apt install -y default-jre
CMD java -jar seleniumServer.jar -role hub
CMD java -jar seleniumServer.jar -role node  -hub http://localhost:4444/grid/register
#ENTRYPOINT ["java", "-jar", "seleniumServer.zip", "-role", "hub"]
