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
        
        resultado=$(find -type f $1 -name "*.$2")
        if [ -z "$resultado" ]; then
            echo "No hay archivos con esa extension"
    else 
        echo "La carpeta no existe"
        return 1
    fi
}

buscar /home/alex 5