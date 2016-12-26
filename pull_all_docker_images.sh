#!/usr/bin/env bash

images=(
"requisition"
"postgres"
"rsyslog"
"requisition-refui"
"referencedata"
"auth"
"notification"
"dev"
"fulfillment"
"nginx"
"openlmis-nginx"
"dev-ui"
"openlmis-example-extensions"
"hauptmedia/proftpd"
)

for image in ${images[@]}
do
    echo "going to pull docker image: $image"
    docker pull "openlmis/$image" &
done
