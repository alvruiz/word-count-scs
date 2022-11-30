#!/bin/bash
printf "[execute.sh] Tearing up containers\n"
printf "[execute.sh] Wait 10s, containers are deploying\n"
sudo docker-compose up > /dev/null &
sleep 10
printf "[execute.sh] Write now your word\n"
sudo docker exec -it kafka-wordcount /opt/kafka/bin/kafka-console-producer.sh --broker-list kafka:29092 --topic input
