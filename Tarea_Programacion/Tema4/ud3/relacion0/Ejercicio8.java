// Crea una función llamada mayor que reciba dos números y devuelva el mayor de los dos.
package Tarea_Programacion.Tema4.ud3.relacion0;

import java.util.Scanner;

public class Ejercicio8 {
    //En funciones no se puede poner system.out
    public static boolean mayor(int a, int b){
        
        if (a > b) {
            return true;
        } else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaro las variables
        int operando1, operando2;

        System.out.println("Dime un numero: ");
        operando1 = scanner.nextInt();

        System.out.println("Dime otro numero: ");
        operando2 = scanner.nextInt();
        
        boolean resultadoMayorMenor = mayor(operando1, operando2);
        
        if (resultadoMayorMenor == true) {
            System.out.println("El primer numero es mayor que el segundo");
            
        } else {
            System.out.println("El segundo numero es mayor que el primero");
            
            
        }
        scanner.close();
    }
}
