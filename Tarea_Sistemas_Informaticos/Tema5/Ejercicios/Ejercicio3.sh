#!/bin/bash

# Función validar que ya tienes
validar(){
    if [ $1 -gt $2 ]; then
        echo "debe haber $1 argumentos"
        return 1
    fi
}

borrar_archivos_grandes(){
    carpeta=$1
    validar 1 $# || return 1

    if [ -d $carpeta ]; then
        
        # --- PASO 1: CALCULAR EL PESO MÁXIMO (Igual que Ejercicio 2) ---
        pesoMaximo=0
        
        # Sacamos la columna 5 (tamaño)
        tamanios=$(ls -l $carpeta | awk '{print $5}')
        
        for peso in $tamanios; do
            # Validamos que sea número
            if [[ "$peso" =~ ^[0-9]+$ ]]; then
                if [ $peso -gt $pesoMaximo ]; then
                    pesoMaximo=$peso
                fi
            fi
        done
        
        # --- PASO 2: OBTENER LOS NOMBRES Y BORRARLOS ---
        
        # Guardamos en una variable los archivos que coinciden con el peso máximo
        # Usamos la misma lógica de awk que en tu código anterior
        archivos_a_borrar=$( ls -l $carpeta | awk '$5 == '$pesoMaximo' {print $9}' )
        
        # Recorremos la lista de archivos para borrarlos uno a uno
        for archivo in $archivos_a_borrar; do
            # Construimos la ruta completa: carpeta + / + nombre_archivo
            rm "$carpeta/$archivo"
            echo "Archivo borrado: $archivo"
        done
        
    else
        echo "La carpeta debe existir"
        return 1
    fi
}

# Ejemplo de llamada (comentado para que no se ejecute accidentalmente)
# borrar_archivos_grandes /home/alex