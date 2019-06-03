#!/bin/bash

IMAGE_NAME=wildfly/toll-calculator
CONTAINTER_NAME=TollCalculator

docker build -t $IMAGE_NAME . && docker run --name $CONTAINTER_NAME -p 8080:8080 -d $IMAGE_NAME
docker logs -f $CONTAINTER_NAME