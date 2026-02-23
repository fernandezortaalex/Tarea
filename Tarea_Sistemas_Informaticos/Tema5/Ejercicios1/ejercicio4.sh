#!/bin/bash
volumen_esfera(){
    resultado=$(echo " ((3.14 * ($1 ^ 3)) * 4) / 3" | bc)
    echo $resultado
}
volumen=$(volumen_esfera 5)
echo "El resultado del volumen de la esfera es $volumen"