# docker

## Daily commands

**docker images** *Show the images in docker*

**docker build -t image_name .** *Build image from dockerfile*

**docker rmi <imageID>** *Remove a docker image*

**docker rmi $(docker images -q) -f** *Remove all docker images*

**docker ps -a** *Show the containers in docker*

**docker rm <containerID>** *Remove a docker container*

**docker rm $(docker ps -a -q) -f** *Remove all docker containers*

**docker-compose up** *Build & update a container*

**docker inspect --format '{{ .NetworkSettings.IPAddress }}' $(docker ps -q)** *Get Ip*


### docker-machine:

**docker-machine create -d virtualbox temp.sysadmin.local** *create a virtual docker container*

**docker-machine ls** *Show the docker machine*

**docker-machine env <machine-name>** *See docker-machine properties*

**@FOR /f "tokens=*" %i IN ('docker-machine env <machine name>') DO @%i** *Change active machine*


> [docker Tutorial](https://www.youtube.com/watch?v=tBfOHso1-6o&t=1s)
> [Sintax Readme.md](https://help.github.com/articles/basic-writing-and-formatting-syntax)
> [Git Commant](http://rogerdudler.github.io/git-guide/)
