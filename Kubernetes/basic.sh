#!/bin/sh

sudoapt install -y curl

sudo su

curl https://packages.cloud.google.com/apt/doc/apt-key.gpg | apt-key add -

exit

sudo apt-key update

sudo apt-get update
sudo apt-get install -qy docker.io

sudo apt-get update
sudo apt-get install -y apt-transport-https

sudo curl -s https://packages.cloud.google.com/apt/doc/apt-key.gpg | apt-key add -

sudo echo "deb http://apt.kubernetes.io/ kubernetes-xenial main" > /etc/apt/sources.list.d/kubernetes.list

sudo apt-get update \

sudo apt-get install -y kubelet kubeadm kubernetes-cni


sudo systemctl enable docker.service


# Install Docker CE
## Set up the repository:
### Install packages to allow apt to use a repository over HTTPS
sudo apt-get update
sudo apt-get install apt-transport-https ca-certificates curl software-properties-common

### Add Docker’s official GPG key
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -

### Add Docker apt repository.
sudo add-apt-repository \
  "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
  $(lsb_release -cs) \
  stable"

## Install Docker CE.
sudo apt-get update
sudo apt-get install docker-ce=18.06.2~ce~3-0~ubuntu

# Setup daemon.
sudo cat > /etc/docker/daemon.json <<EOF
{
  "exec-opts": ["native.cgroupdriver=systemd"],
  "log-driver": "json-file",
  "log-opts": {
    "max-size": "100m"
  },
  "storage-driver": "overlay2"
}
EOF

sudo mkdir -p /etc/systemd/system/docker.service.d

# Restart docker.
sudo systemctl daemon-reload
sudo systemctl restart docker
