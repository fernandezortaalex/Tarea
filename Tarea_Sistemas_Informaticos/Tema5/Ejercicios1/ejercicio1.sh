#!/bin/bash

comprobarNumero(){
# Si la cantidad de parametros no es igual al numero que deberia haber termina
    if [ $1 -ne $2 ]; then
        echo "Debe haber $2 numeros."
        return 1
    fi
}
division(){
    # Le paso el numero de parametros y cuantos deberia haber
    comprobarNumero $# 2 || return 1
    resultado=$(( $1 / $2 ))
    echo "El resultado es $resultado"
    
}

division $@
