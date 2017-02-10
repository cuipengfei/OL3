#!/usr/bin/env bash

images=(
"requisition:3.0.0-SNAPSHOT"
"postgres"
"rsyslog"
"requisition-refui:3.0.0-SNAPSHOT"
"referencedata:3.0.0-SNAPSHOT"
"auth:3.0.0-SNAPSHOT"
"notification:3.0.0-SNAPSHOT"
"dev"
"fulfillment:3.0.0-SNAPSHOT"
"nginx"
"openlmis-nginx"
"dev-ui"
"openlmis-example-extensions"
"hauptmedia/proftpd"
"stockmanagement:1.0.0-BETA-SNAPSHOT"
)

for image in ${images[@]}
do
    echo "going to pull docker image: $image"
    docker pull "openlmis/$image" &
done
