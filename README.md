# docker

## Index
- [Ubuntu](Ubuntu/README.md)
- [Python](Python/README.md)
- [Java](Java/README.md)
- [NodeJs](NodeJs/README.md)
- [GitAutoCommit](GitAutoCommit/README.md)

## TOP USED :
**docker rmi $(docker images -f "dangling=true" -q) -f** *Remove "none" Images*

**docker rmi $(docker images -q) -f** *Remove all docker images*

**docker rm $(docker ps -a -q) -f** *Remove all docker containers*

**docker commit container-name tag** *Create a image from a container*

**docker tag imagesID new-docker-name:tag** *Rename image*

## Daily commands
**docker images** *Show the images in docker*

**docker rmi <imageID>** *Remove a docker image*

**docker rmi $(docker images -q) -f** *Remove all docker images*

**docker ps -a** *Show the containers in docker*

**docker rm <containerID>** *Remove a docker container*

**docker rm $(docker ps -a -q) -f** *Remove all docker containers*

**docker-compose up** *Build & update a container*

**docker-machine create -d virtualbox <machine-name>** *Create a new docker machine*

**docker rmi $(docker images -f "dangling=true" -q) -f** *Remove "none" Images*

**docker inspect --format '{{ .NetworkSettings.IPAddress }}' $(docker ps -q)** *Get Ip


## docker-machine:

**docker-machine create -d virtualbox temp.sysadmin.local** *create a virtual docker container*

**docker-machine ls** *Show the docker machine*

**docker-machine env <machine-name>** *See docker-machine properties*

**@FOR /f "tokens=*" %i IN ('docker-machine env docker-machine-name') DO @%i** *Change active machine*

**eval "$(docker-machine env default)"** *Connect your shell to the new machine*

**docker-machine stop default** *Stop*

**docker-machine start default** *Start*

others commands:
- `docker-machine config`
- `docker-machine env`
- `docker-machine inspect`
- `docker-machine ip`
- `docker-machine kill`
- `docker-machine provision`
- `docker-machine regenerate-certs`
- `docker-machine restart`
- `docker-machine ssh`
- `docker-machine start`
- `docker-machine status`
- `docker-machine stop`
- `docker-machine upgrade`
- `docker-machine url`

> [docker Tutorial](https://www.youtube.com/watch?v=tBfOHso1-6o&t=1s)

> [Sintax Readme.md](https://help.github.com/articles/basic-writing-and-formatting-syntax)

> [Git Commant](http://rogerdudler.github.io/git-guide/)
