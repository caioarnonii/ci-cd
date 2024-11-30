#!/bin/bash
set -xe

# Iniciando o processo em background, escrevendo seus logs em /tmp/pocpet.log
nohup java -jar /home/ubuntu/deploy-api/consol-crud-java-0.0.1-SNAPSHOT.jar  > /tmp/pocpet.log 2>&1 &

# Salvando o PID num arquivo
echo $! > api.txt