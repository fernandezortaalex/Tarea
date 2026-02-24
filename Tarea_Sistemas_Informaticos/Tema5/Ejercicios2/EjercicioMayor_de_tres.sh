mayor_de_tres(){
    numeroMayor=0
    for ((i=0; i<$#; i++)); do
        if [ $numeroMayor -lt $i ]; then
            numeroMayor=$i
        fi
    done
    echo "El numero mayor es $numeroMayor"
}
mayor_de_tres $@