#!/bin/bash
perimetro_circulo(){
    # Pongo el echo para enviarle la operacion a bc(Para obtener decimales) y lo envolvemos todo en ()
    resultado=$(echo "2 * 3.14 * $1 " | bc)
    echo $resultado
}
perimetro=$(perimetro_circulo 5)
echo "El perimetro del circulo es: $perimetro"