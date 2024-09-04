#!/bin/bash
set -e
sleep 30
mkdir -p /var/run/mysqld
exec mysqld_safe --datadir=/var/lib/mysql --socket=/tmp/mysql.sock &
