# Docker


## Daily commands

**Docker images** *Show the images in docker*

**Docker rmi <imageID>** *Remove a docker image*

**Docker rmi $(docker images -q) -f** *Remove all docker images*

**Docker ps -a** *Show the containers in docker*

**Docker rm <containerID>** *Remove a docker container*

**Docker rm $(docker ps -a -q) -f** *Remove all docker containers*

**Docker-compose up** *Build & update a container*

**docker-machine create -d virtualbox temp.sysadmin.local** *create a virtual docker container*

**docker inspect --format '{{ .NetworkSettings.IPAddress }}' $(docker ps -q)** *Get Ip*
