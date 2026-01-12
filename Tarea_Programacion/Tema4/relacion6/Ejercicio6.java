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
        numero1 = scanner.nextLine();
        
        //equalsIgnoreCase ignora las mayusculas y minusculas
        while (!numero1.equalsIgnoreCase("salir")) {
            //Paso el numero a modo int
            //Tambien se puede pasar a numero decimal poniendo .parseDouble
            //Tambien puedo pasar de numero a string con .value
            operando1 = Integer.parseInt(numero1);

            System.out.println("Introduce el segundo número: ");
            operando2 = scanner.nextInt();
            
            System.out.println("Introduce la operación: ");
            //Cuando introduces un nextLine despues de un nextInt o que guarde numero coge el \n del anterior println y coge ese valor, que esta en blanco, si no se pone esto da error
            scanner.nextLine();
            operador = scanner.nextLine();
            
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
            numero1 = scanner.nextLine();
            scanner.nextLine();
        }
        scanner.close();
    }
}
