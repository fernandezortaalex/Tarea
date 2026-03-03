comprobarParametros(){
    if [ $1 -ne $2 ]; then
        echo "Debe haber $2 numero."
        return 1
    fi
}
crear_directorio(){
    comprobarParametros $# 1 || return 1
    if [ -d "$1" ]; then
        echo "El archivo ya existe"
    else
        mkdir -p $1
        echo "Directorio creado"
    fi
}
nombreCarpeta=$1
parametro="."
crear_directorio "$parametro/$nombreCarpeta"