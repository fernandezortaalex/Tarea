comprobarNumero(){
# Si la cantidad de parametros no es igual al numero que deberia haber termina
    if [ $1 -ne $2 ]; then
        echo "Debe haber $2 numeros."
        return 1
    fi
}
potencia(){
    comprobarNumero $# 2 || return 1
    # Esta opcion no acepta decimales
    # resultado=$(($1 ** $2))

    # Esta opcion si acepta decimales
    resultado=$(echo $1 ^ $2 | bc)
    echo "El resultado de la potencia es $resultado"
}

potencia $@