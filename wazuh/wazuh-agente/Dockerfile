FROM ubuntu:18.04
RUN apt update
RUN apt-get update
RUN apt-get install curl vim apt-transport-https lsb-release gnupg2 -y
RUN curl -s https://packages.wazuh.com/key/GPG-KEY-WAZUH | apt-key add -
RUN echo "deb https://packages.wazuh.com/3.x/apt/ stable main" | tee /etc/apt/sources.list.d/wazuh.list
RUN apt-get update
RUN WAZUH_MANAGER="localhost" WAZUH_REGISTRATION_PASSWORD="admin" WAZUH_AGENT_NAME="admin" apt-get install wazuh-agent
RUN apt install net-tools -y
COPY ./init.sh ./init.sh
ENTRYPOINT [ "sh", "init.sh"]