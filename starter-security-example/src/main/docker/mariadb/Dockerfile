FROM mariadb:10.3
MAINTAINER Tobias Schneider <Tobias.Schneider@synyx.de>

ENV MYSQL_USER=auth \
    MYSQL_PASSWORD=auth \
    MYSQL_RANDOM_ROOT_PASSWORD=yes

ADD create-auth-database.sql /docker-entrypoint-initdb.d/create-auth-database.sql
