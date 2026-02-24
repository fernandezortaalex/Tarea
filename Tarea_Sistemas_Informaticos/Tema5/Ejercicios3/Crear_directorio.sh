comprobarParametros(){
    
}
crear_directorio(){
    if [ -d "$1" ]; then
        echo "El archivo ya existe"
    else
        mkdir -p $1
        echo "Directorio creado"
    fi
}
nombreCarpeta=$1
parametro="."
crear_directorio "$parametro/$1"