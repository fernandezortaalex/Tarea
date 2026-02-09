#!/bin/bash
area_rectangulo(){
    area=$1
    altura=$2
    resultado=$(echo "$area * $altura" | bc)
    echo $resultado
}
area=$(area_rectangulo 3.35 4.45)
echo "El resultado es $area"