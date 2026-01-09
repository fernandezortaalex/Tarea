package Tarea_Programacion.Tema4.relacion3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        //Declaro las variables
        int numero = 0;
        final int MINIMO = 10;
        final int MAXIMO = 20;
        boolean estaEntre10y20 = numero >= MINIMO && numero <= MAXIMO;

        System.out.println("Introduce el numero: ");
        numero = scanner1.nextInt();
        scanner1.close();

        if (estaEntre10y20) {
            System.out.println("El numero esta entre 10 y 20");
        } else {
            System.out.println("El numero no esta entre 10 y 20");
        }
    }
}
