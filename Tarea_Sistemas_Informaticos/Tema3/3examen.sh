#!/bin/bash
comprobacionUsuario=$(cat /etc/passwd | cut -d: -f1 | grep -w $1 | wc -l)

if [ $((comprobacionUsuario)) -lt 1 ]; then
  echo "El usuario no existe"
else
  ps -u $1 -o user,pcpu,command --sort=pcpu | head -3
fi
