#!/bin/bash
set -xe

# Start Tomcat, the application server.
#service tomcat start
#nohup java -jar /usr/local/app/listacomprathymeleaf-0.0.1-SNAPSHOT.jar &

systemctl start listacomprathymeleaf.service
