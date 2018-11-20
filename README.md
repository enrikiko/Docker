# Docker


## Daily commands
**Docker images** *Show the images in docker* \n
**Docker rmi <imageID>** *Remove a docker image* \n
**Docker rmi $(docker images -q) -f** *Remove all docker images* \n
**Docker ps -a** *Show the containers in docker* \n
**Docker rm <containerID>** *Remove a docker container* \n
**Docker rm $(docker ps -a -q) -f** *Remove all docker containers* \n
**Docker-compose up** *Build & update a container* \n
**Docker-machine create -d virtualbox <machine-name** *Create a new docker machine*\n

**Docker-machine ls** *Show the docker machine*\n

**Docker-machine env <machine-name>** *See docker-machine properties*\n

**@FOR /f "tokens=*" %i IN ('docker-machine env <machine name>') DO @%i** *Change active machine*

**eval "$(docker-machine env default)"** *Connect your shell to the new machine*

**docker-machine stop default** *Stop*

**docker-machine start default** *Start*

https://www.youtube.com/watch?v=tBfOHso1-6o&t=1s
