#!/bin/bash
validar(){
    # $1 es el número de argumentos necesarios
    # $2 es el número total de argumentos pasados ($#)
    if [ $1 -gt $2 ]; then
        echo "debe haber $1 argumentos"
        return 1
    fi
}
archivos_mas_pesados(){
    carpeta=$1
    validar 1 $# || return 1
    # Comprobamos si es un directorio válido
    if [ -d $carpeta ]; then
        
        # 1. Encontrar el peso máximo
        pesoMaximo=0
        
        # Obtenemos solo la columna 5 (tamaño) como en la función 'tamanio_dir'
        # Nota: Se usa $carpeta/* para no entrar en subcarpetas recursivamente (find no se usa aquí)
        tamanios=$(ls -l $carpeta | awk '{print $5}')
        
        for peso in $tamanios; do
            # Filtramos líneas que no sean números (como la línea 'total' del ls -l)
            if [[ "$peso" =~ ^[0-9]+$ ]]; then
                if [ $peso -gt $pesoMaximo ]; then
                    pesoMaximo=$peso
                fi
            fi
        done
        
        # 2. Buscar archivos que coincidan con ese peso
        # Usamos awk para imprimir nombre ($9) y tamaño ($5), similar a función 'propietario'
        resultado=$( ls -l $1 | awk '$5 == '$pesoMaximo' {print $9}' )
        echo $resultado
        
    else
        echo "La carpeta debe existir"
        return 1
    fi
}
archivos_mas_pesados /home/alex