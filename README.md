# Docker

## Daily commands

**Docker images** *Show the images in docker*

**Docker rmi <imageID>** *Remove a docker image*

**Docker rmi $(docker images -q) -f** *Remove all docker images*

**Docker ps -a** *Show the containers in docker*

**Docker rm <containerID>** *Remove a docker container*

**Docker rm $(docker ps -a -q) -f** *Remove all docker containers*

**Docker-compose up** *Build & update a container*

**docker inspect --format '{{ .NetworkSettings.IPAddress }}' $(docker ps -q)** *Get Ip*


### Docker-machine:

**docker-machine create -d virtualbox temp.sysadmin.local** *create a virtual docker container*

**Docker-machine ls** *Show the docker machine*

**Docker-machine env <machine-name>** *See docker-machine properties*

**@FOR /f "tokens=*" %i IN ('docker-machine env <machine name>') DO @%i** *Change active machine*


> [Docker Tutorial](https://www.youtube.com/watch?v=tBfOHso1-6o&t=1s)
> [Sintax Readme.md](https://help.github.com/articles/basic-writing-and-formatting-syntax)
> [Git Commant](http://rogerdudler.github.io/git-guide/)
