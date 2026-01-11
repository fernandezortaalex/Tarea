package Tarea_Programacion.Tema4.relacion6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo las variables
        
        int operando1, operando2;
        String operador, numero1;
        int resultado = 0;

        //Pongo el primer numero en modo texto
        System.out.println("Introduce el primer número: ");
        numero1 = scanner.next();
        //Lo pongo siempre en minusculas
        numero1 = numero1.toLowerCase();
        
        while (!numero1.equals("salir")) {
            //Paso el numero a modo int
            operando1 = Integer.parseInt(numero1);

            System.out.println("Introduce el segundo número: ");
            operando2 = scanner.nextInt();
            
            System.out.println("Introduce la operación: ");
            operador = scanner.next();
            
            //equals es para comprarar el contenido de dos strings
            if (operador.equals("+")) {
                resultado = operando1 + operando2;
            } else if (operador.equals("-")) {
                resultado = operando1 - operando2;
            } else if (operador.equals("*")) {
                resultado = operando1 * operando2;
            } else if (operador.equals("/")) {
                
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("No se puede dividir entre: " + operando2);
                }
            } else {
                System.out.println("Operador incorrecto");
            }
            System.out.println("El resutado de " + operando1 + operador + operando2 + " es " + resultado);
            
            System.out.println("Introduce el primer número: ");
            numero1 = scanner.next();
            numero1 = numero1.toLowerCase();
        }
        scanner.close();
    }
}
