##Guía
Para ejecutar el programa ejecuta:
- Docker-compose up
- Abre kowl en navegador para ver las colas: http://localhost:18080
- Ejecuta en un terminal el siguiente comando: ```sudo docker exec -it kafka-wordcount /opt/kafka/bin/kafka-console-producer.sh --broker-list kafka:29092 --topic input```
- Escribe un mensaje en terminal y observa como se muestra en kowl.