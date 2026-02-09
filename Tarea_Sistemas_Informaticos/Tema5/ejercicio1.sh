#!/bin/bash

division(){
  resultado=$(( $1 / $2 ))
  echo $resultado
}

dividir=$(division 6 2)
echo "El resultado es  $dividir"