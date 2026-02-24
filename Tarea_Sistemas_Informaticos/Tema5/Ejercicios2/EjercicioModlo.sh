#!/bin/bash
modulo(){
    resultado=$(( $1 % $2 ))
    echo $resultado
}
# Introduzco los parametros preguntandole al usuario y le asigno un valor
read -p "Introduce el primer numero: " num1
read -p "Introduce el segundo numero: " num2
resultado=$(modulo $num1 $num2)
echo "El resto es $resultado"