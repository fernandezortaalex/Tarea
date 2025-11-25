#!/bin/bash

pares=2
archivos=$2
contador=0
if [ $# -lt 2 ]; then
  echo "No hay 2 parametros"
else
  while [ "$contador" -lt "$archivos" ]; do
   sudo touch "$1""$1""$pares"".txt"
   pares=$((pares + 2))
   contador=$((contador + 1))
  done
fi

