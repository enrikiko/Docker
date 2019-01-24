# docker

## Daily commands
**Docker images** *Show the images in docker* \n
**Docker rmi <imageID>** *Remove a docker image* \n
**Docker rmi $(docker images -q) -f** *Remove all docker images* \n
**Docker ps -a** *Show the containers in docker* \n
**Docker rm <containerID>** *Remove a docker container* \n
**Docker rm $(docker ps -a -q) -f** *Remove all docker containers* \n
**Docker-compose up** *Build & update a container* \n
**Docker-machine create -d virtualbox <machine-name** *Create a new docker machine*\n
**Docker rmi $(docker images -f "dangling=true" -q)** *Remove Images <none>* \n
**docker inspect --format '{{ .NetworkSettings.IPAddress }}' $(docker ps -q)** *Get Ip*\n


### docker-machine:

**docker-machine create -d virtualbox temp.sysadmin.local** *create a virtual docker container*

**docker-machine ls** *Show the docker machine*

**docker-machine env <machine-name>** *See docker-machine properties*

**@FOR /f "tokens=*" %i IN ('docker-machine env docker-machine-name') DO @%i** *Change active machine*

**eval "$(docker-machine env default)"** *Connect your shell to the new machine*

**docker-machine stop default** *Stop*

**docker-machine start default** *Start*

others commands:
- `docker-machine config`
<!-- - `docker-machine env` -->
- `docker-machine inspect`
- `docker-machine ip`
- `docker-machine kill`
- `docker-machine provision`
- `docker-machine regenerate-certs`
- `docker-machine restart`
- `docker-machine ssh`
<!-- - `docker-machine start` -->
- `docker-machine status`
<!-- - `docker-machine stop` -->
- `docker-machine upgrade`
- `docker-machine url`


> [docker Tutorial](https://www.youtube.com/watch?v=tBfOHso1-6o&t=1s)
> [Sintax Readme.md](https://help.github.com/articles/basic-writing-and-formatting-syntax)
> [Git Commant](http://rogerdudler.github.io/git-guide/)
