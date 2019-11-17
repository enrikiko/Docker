FROM ubuntu:18.04
RUN apt update
RUN apt-get update
RUN apt-get install curl apt-transport-https lsb-release gnupg2 -y
RUN curl -s https://packages.wazuh.com/key/GPG-KEY-WAZUH | apt-key add -
RUN echo "deb https://packages.wazuh.com/3.x/apt/ stable main" | tee /etc/apt/sources.list.d/wazuh.list
RUN apt-get update
RUN apt install vim -y
COPY ./init.sh ./init.sh
ENTRYPOINT [ "sh", "init.sh" ]