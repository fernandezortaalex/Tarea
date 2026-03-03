#!/bin/bash
validar(){
    # $1 es el número de argumentos necesarios
    # $2 es el número total de argumentos pasados ($#)
    if [ $1 -gt $2 ]; then
        echo "debe haber $1 argumentos"
        return 1
    fi
}
calcular_maximo(){
    # Validamos que haya al menos 1 parámetro
    validar 1 $# || return 1
    
    numeroMaximo=0
    
    # Iteramos sobre todos los argumentos recibidos
    for numero in "$@"; do
        # Comparamos si el número actual es mayor que el máximo guardado
        if [ $numero -gt $numeroMaximo ]; then
            numeroMaximo=$numero
        fi
    done
    
    echo "El número máximo es: $numeroMaximo"
}
calcular_maximo $@