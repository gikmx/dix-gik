git.prompt(){
    local cgitb="\033[01;36m" # cyan
    local crset="\033[01;0m"  # reset
    local branch=`git branch --no-color 2>/dev/null | grep "\*" --color=none | sed 's/^\*\s*//'`
    [ "$branch" != "" ] && echo -ne "$cgitb$branch » $crset"
}