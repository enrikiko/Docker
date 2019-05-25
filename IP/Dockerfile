FROM ubuntu:18.04
RUN apt-get update
RUN apt-get install curl
RUN touch log
COPY bucle.sh bucle.sh
ENTRYPOINT ["sh", "bucle.sh"]
