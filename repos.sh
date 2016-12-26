#!/usr/bin/env bash

services=(
"openlmis-requisition" "openlmis-referencedata"
"openlmis-fulfillment" "openlmis-auth"
"openlmis-notification")

infrastructures=(
"openlmis-rsyslog" "docker-dev"
"postgres" "nginx-proxy"
"openlmis-nginx")

tests=("openlmis-contract-tests")

devops=("openlmis-deployment" "openlmis-blue")

examples=(
"openlmis-example" "openlmis-template-service"
"openlmis-example-extensions")

ui=("openlmis-requisition-refUI"  "dev-ui")

config=("openlmis-config")

repoNames=("${services[@]}" "${infrastructures[@]}" "${tests[@]}" "${devops[@]}" "${examples[@]}" "${ui[@]}" "${config[@]}")
