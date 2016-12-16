#!/usr/bin/env bash

. ./repos.sh

for repoName in ${repoNames[@]}
do
    echo "going to clone: $repoName"
    git clone "git@github.com:OpenLMIS/$repoName.git" &
done
