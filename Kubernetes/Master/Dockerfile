FROM ubuntu:18.04
RUN apt-get update
RUN apt update
RUN apt-get install tree
RUN apt-get install locate
RUN updatedb
RUN apt-get -y install man
RUN apt-get -y install vim
RUN apt-get install -y software-properties-common
RUN apt-add-repository --yes --update ppa:ansible/ansible
RUN apt-get -y install ansible
RUN apt install -y python3-pip
RUN apt install -y curl
RUN apt install wget
RUN apt install -y git
RUN apt-get install -qy docker.io
RUN apt-get update \
  && apt-get install -y apt-transport-https \
  && curl -s https://packages.cloud.google.com/apt/doc/apt-key.gpg | apt-key add -
RUN echo "deb http://apt.kubernetes.io/ kubernetes-xenial main"   | tee -a /etc/apt/sources.list.d/kubernetes.list   && apt-get update
RUN apt-get update \
  && apt-get install -y \
  kubelet \
  kubeadm \
  kubernetes-cni
RUN apt install net-tools
WORKDIR /tmp/kubernetes
RUN kubeadm | cat > README.md
