#!/bin/bash
# Objetivo: Crear una función para validar el número de parámetros (comprobar que hay al menos n parámetros).
validar(){
    # $1 es el número de argumentos necesarios
    # $2 es el número total de argumentos pasados ($#)
    if [ $1 -gt $2 ]; then
        echo "debe haber $1 argumentos"
        return 1
    fi
}

validar $@