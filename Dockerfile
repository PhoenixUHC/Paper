ARG git_ref
FROM localhost:5000/kig-builder:${git_ref} AS builder

FROM openjdk:8-jdk-alpine
RUN apk add --no-cache --update curl ca-certificates openssl git tar bash sqlite fontconfig \
    && adduser --disabled-password --home /home/container container && mkdir -p /home/server/plugins \
    && chown -R container:container /home/server && echo eula=true > eula.txt
USER container
ARG git_ref=master
ENV USER=container HOME=/home/container KIG_PLATFORM=hotspot
WORKDIR /home/container
COPY --from=builder ./build/PaperSpigot-Server/target/paperspigot*.jar /home/server/server.jar
COPY ./docker/entrypoint.sh /entrypoint.sh
CMD ["/bin/bash", "/entrypoint.sh"]
