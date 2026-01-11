// <script>
//     let tabla = prompt("Introduce el numero")
//     let multiplicaion = 0
//     let iteracionUsuario = 0

//     for(let i = 0; i < 10;i++){
//         iteracionUsuario = i + 1
//         multiplicaion = tabla * iteracionUsuario
//         console.log(tabla + " x " + iteracionUsuario + " = " + multiplicaion);
//     }

// </script>

package Tarea_Programacion.Tema4.relacion4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo las variables
        int numeroEntero;
        int resultado;

        System.out.println("Dime un numero entero positivo: ");
        numeroEntero = scanner.nextInt();
        scanner.close();

        for (int i = 1; i < 11; i++) {
            resultado = numeroEntero * i;
            System.out.println(numeroEntero + " * " + i + " = "+ resultado);
        }
    }
}
