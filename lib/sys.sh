#! /usr/bin/env bash
! $DIX && >&2 echo "DIX404" && exit 1

# Test if current directory has git initialised
sys.has_git(){
    git status > /dev/null 2> /dev/null
}
