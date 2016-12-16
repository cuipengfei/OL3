#!/usr/bin/env bash

. ./repos.sh

for repoName in ${repoNames[@]}
do
    echo "going to pull rebase: $repoName"
    git --git-dir="./$repoName/.git" --work-tree="./$repoName/" pull --rebase &
done

