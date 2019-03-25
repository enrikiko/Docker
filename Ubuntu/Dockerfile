# Pull base image.
FROM ubuntu:18.04

RUN apt-get update
#Basic
RUN apt update
RUN apt-get install tree
RUN apt-get install locate
RUN updatedb
RUN apt-get -y install man
RUN apt update
RUN apt install -y python3-pip
RUN pip3 install awscli --upgrade --user
#Http request
RUN apt install -y curl
RUN apt install wget
#Ansible
RUN apt-get install -y software-properties-common
RUN apt-add-repository --yes --update ppa:ansible/ansible
RUN apt-get -y install ansible

RUN apt install -y git

WORKDIR /tmp/enrique
RUN git clone https://github.com/enrikiko/docker/
RUN git clone https://github.com/enrikiko/Python/
