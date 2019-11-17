FROM ubuntu:18.04
RUN apt update
RUN apt-get update
RUN apt-get install curl apt-transport-https lsb-release gnupg2 -y
RUN curl -s https://packages.wazuh.com/key/GPG-KEY-WAZUH | apt-key add -
RUN echo "deb https://packages.wazuh.com/3.x/apt/ stable main" | tee -a /etc/apt/sources.list.d/wazuh.list
RUN apt-get update
RUN apt-get install wazuh-manager
# RUN service wazuh-manager status
RUN apt-get install nodejs -y
RUN apt-get install wazuh-api -y
RUN service wazuh-api status
RUN apt-get install curl apt-transport-https -y
RUN curl -s https://artifacts.elastic.co/GPG-KEY-elasticsearch | apt-key add -
RUN echo "deb https://artifacts.elastic.co/packages/7.x/apt stable main" | tee /etc/apt/sources.list.d/elastic-7.x.list
RUN apt-get update
RUN apt-get install tree -y
RUN apt-get install filebeat=7.4.2 -y; exit 0
RUN curl -so /etc/filebeat/filebeat.yml https://raw.githubusercontent.com/wazuh/wazuh/v3.10.2/extensions/filebeat/7.x/filebeat.yml; exit 0
RUN curl -so /etc/filebeat/wazuh-template.json https://raw.githubusercontent.com/wazuh/wazuh/v3.10.2/extensions/elasticsearch/7.x/wazuh-template.json; exit 0
RUN curl -s https://packages.wazuh.com/3.x/filebeat/wazuh-filebeat-0.1.tar.gz | tar -xvz -C /usr/share/filebeat/module; exit 0
RUN update-rc.d filebeat defaults 95 10
RUN service filebeat start; exit 0
COPY ./init.sh ./init.sh
ENTRYPOINT [ "sh", "init.sh" ]