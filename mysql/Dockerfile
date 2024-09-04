FROM arm64v8/ubuntu:latest

# Instala MySQL y herramientas necesarias
RUN apt-get update && apt-get install -y \
    mysql-server \
    mysql-client \
    && rm -rf /var/lib/apt/lists/*

ENV MYSQL_ROOT_PASSWORD=admin
ENV MYSQL_DATABASE=ms_productos

EXPOSE 3306

COPY init.sql /docker-entrypoint-initdb.d/

# Ejecuta el script de inicio personalizado
COPY entrypoint.sh /entrypoint.sh
ENTRYPOINT ["/entrypoint.sh"]
CMD ["mysqld_safe", "--datadir=/var/lib/mysql", "--socket=/tmp/mysql.sock"]
