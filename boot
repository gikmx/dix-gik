#! /usr/bin/env bash
! $DIX && >&2 echo "DIX404" && exit 1

DIX_ON_AFTER(){

	# Set the author email
	if [ ! -f $DIX_PATH_SRV/GIT_AUTHOR_EMAIL ]; then
	    show.info "Configuring GIT Author Email ..."
	    tmp="$(whoami)@$(hostname)"
	    read -p "Your email address? ["$tmp"]" input
	    [ -z "$input" ] && name=$tmp
	    echo "$input" > $DIX_PATH_SRV/GIT_AUTHOR_EMAIL
	fi

}
