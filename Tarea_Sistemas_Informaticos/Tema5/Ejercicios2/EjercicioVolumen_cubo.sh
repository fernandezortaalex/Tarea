#!/bin/bash
comprobarNumero(){
# Si la cantidad de parametros no es igual al numero que deberia haber termina
    if [ $1 -ne $2 ]; then
        echo "Debe haber $2 numero."
        return 1
    fi
}
volumen_cubo(){
    comprobarNumero $# 1 || return 1
    resultado=$(( $1 ^ 3 ))
    echo "El resultado del volumen es $resultado"
}
volumen_cubo $@