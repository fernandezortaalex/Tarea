#!/bin/bash
area_circulo(){
    resultado=$((3.14 * ($1 * 2)))
    echo $resultado
}

area=$(area_circulo 5)
echo "El area del circulo es $area"