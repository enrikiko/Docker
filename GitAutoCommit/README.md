# docker

## How to run it
- docker build -t autocommitimage --build-arg PASSWORD=<Password> --build-arg GIT_EMAIL=<git_email> --build-arg GIT_USER=<git_user> .
- docker run -d --name autocommitcontainer autocommitimage
