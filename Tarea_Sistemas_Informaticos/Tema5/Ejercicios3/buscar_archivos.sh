comprobarParametros(){
    if [ $1 -ne $2 ]; then
        echo "Debe haber $2 argumentos."
        return 1
    fi
}
buscar(){
    comprobarParametros $# 2 || return 1
    # Compruebo que la carpeta existe
    if [ -d $1 ]; then
        # Paso el numero que le hemos pasado ah bytes
        bytes=$(( $2 * 1024 * 1024 ))
        find $1 -size -$bytes
    else 
        echo "La carpeta no existe"
        return 1
    fi
}

buscar /home/alex 5