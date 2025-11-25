#!/bin/bash
archivo=$1
palabras=$@
if [ -f "$archivo" ]; then

  echo "existe el archivo"
  for palabra in "$palabras"; do
  echo nano "$palabra" >> "$archivo"
  done

else
  echo "No existe el archivo"
fi

