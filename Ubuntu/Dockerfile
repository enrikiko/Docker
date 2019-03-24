# Pull base image.
FROM ubuntu:18.04
#RUN sudo
RUN apt-get update
RUN apt update
RUN apt-get install tree
RUN apt-get install locate
RUN updatedb
RUN apt-get -y install man
RUN apt update
Run apt install -y python3-pip
Run pip3 install awscli --upgrade --user

Copy requirement.txt ./
RUN requirement.txt
