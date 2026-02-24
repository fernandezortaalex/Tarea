#!/bin/bash
verificar_par(){
    resultado=$(( $1 % 2 ))
    if [ $resultado -ne 0 ]; then
        echo "El numero es impar"
    else
        echo "El numero es par"
    fi
}

read -p "Introduce el primer numero: " num1

verificar_par $num1
