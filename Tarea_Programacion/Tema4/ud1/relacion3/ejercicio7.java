package Tarea_Programacion.Tema4.ud1.relacion3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaro las variables
        double operando1, operando2;
        double resultado = 0;
        String operador;

        System.out.println("Introduzca un número: ");
        operando1 = scanner.nextDouble();

        System.out.println("Introduzca otro número: ");
        operando2 = scanner.nextDouble();

        System.out.println("Introduzca el operador (+, -, *, /): ");
        operador = scanner.next();
        scanner.close();

        //equals es para comprar dos strings
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

        System.out.println("El resultado es: " + resultado);

    }
}
