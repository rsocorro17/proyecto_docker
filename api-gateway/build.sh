#!/bin/bash

# Construir el JAR
mvn clean package -DskipTests

# Construir la imagen Docker
docker build -t api-gateway .

# Ejecutar el contenedor
docker run -p 8080:8080 --name api-gateway api-gateway