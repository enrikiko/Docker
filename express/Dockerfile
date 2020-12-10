FROM alpine
RUN apk add npm
RUN mkdir /root/node
WORKDIR /root/node
RUN mkdir images
RUN mkdir tmp
COPY package/. .
RUN npm install
COPY . .
CMD node app.js
