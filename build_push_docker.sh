#!/bin/bash
#
# Copyright 2018-2019 The Jaeger Authors
#
# Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
# in compliance with the License. You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software distributed under the License
# is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
# or implied. See the License for the specific language governing permissions and limitations under
# the License.
#


# docker organization
DOCKER_ORG='jkandasa' 

# tag version
TAG='3.3'

# compile java project
mvn clean package -Dmaven.test.skip=true

# build docker image
docker build -t ${DOCKER_ORG}/jaeger-performance-test:${TAG} .

# push new image to docker hub
docker push ${DOCKER_ORG}/jaeger-performance-test:${TAG}
