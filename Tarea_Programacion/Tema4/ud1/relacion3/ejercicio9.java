// let numero = prompt("Introduzca un número de dos dígitos:")
//     numero = Number(numero)

//     // ¿Qué pasa con los números negativos? En este código no lo hemos tenido en cuenta.

//     if (numero >= 10 && numero <= 99) {
//         // Creamos las variables dentro del if, porque solo se van a utilizar si el número tiene dos cifras.
//         let digitoDecenas = parseInt(numero / 10)
//         let digitoUnidades = numero % 10
//         let suma = digitoDecenas + digitoUnidades
//         console.log("El número tiene dos cifras, la suma de sus cifras es: " + suma)
//     } else {
//         console.log("El número no tiene dos cifras")
//     }

package Tarea_Programacion.Tema4.ud1.relacion3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        //Creo las variables
        int numero;
        int digitoDecenas;
        int digitoUnidades;
        int suma;

        System.out.println("Introduce el numero de 2 digitos");
        numero = scanner1.nextInt();
        scanner1.close();

        //Creo la condicion para entrar 
        if (numero >= 10 && numero <= 99 || numero <= -10 && numero >= -99) {
            //Saco el primer digito dividiendo entre 10 y como es una variable int solo coge el primer digito
            digitoDecenas = numero / 10;
            //Saco el segundo digito haciendo el multiplo de 10 y como es una variable solo coge el digito redondo
            digitoUnidades = numero % 10;
            //Sumo los dos numeros 
            suma = digitoDecenas + digitoUnidades;
            System.out.println("El numero tiene dos cifras y la suma es: " + suma);
        } else {
            System.out.println("El numero no tiene dos cifras");
        }
    }
}
