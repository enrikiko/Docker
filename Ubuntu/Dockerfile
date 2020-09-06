FROM ubuntu:18.04
RUN apt-get update
RUN apt update
RUN apt-get -y install tree
RUN apt-get -y install locate
RUN apt-get -y install man
RUN apt-get -y install vim
RUN updatedb
RUN apt install -y python3-pip
RUN pip3 install awscli --upgrade --user
RUN apt install -y curl
RUN apt install -y wget
RUN apt install -y git
#Ansible
RUN apt-get install -y software-properties-common
RUN apt-add-repository --yes --update ppa:ansible/ansible
RUN apt-get -y install ansible
WORKDIR /tmp/enrique
RUN git clone https://github.com/enrikiko/docker/
RUN git clone https://github.com/enrikiko/Python/
RUN alias py=python
CMD sleep infinity
# RUN apt -y install awscli
# RUN curl -L -o /usr/local/bin/aws-vault https://github.com/99designs/aws-vault/releases/download/v4.2.0/aws-vault-linux-amd64
# RUN chmod 755 /usr/local/bin/aws-vault
