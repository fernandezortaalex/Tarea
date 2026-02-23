#!/bin/bash
comprobarNumero(){
    if [ $1 -ne $2 ]; then
        echo "Debe haber $2 numeros."
        return 1
    fi
}
multiplicar(){
    comprobarNumero $# 2 || return 1
    resultado=$(($1 * $2))
    echo "El resultado de la operacion es: $resultado"
}
multiplicar $@