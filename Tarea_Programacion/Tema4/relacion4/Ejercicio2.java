package Tarea_Programacion.Tema4.relacion4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo las variables
        int numeroSecreto;
        int adivinarNumero;

        System.out.println("Introduce el numero secreto: ");
        numeroSecreto = scanner.nextInt();

        System.out.println("Adivina el numero: ");
        adivinarNumero = scanner.nextInt();

        while (adivinarNumero != numeroSecreto) {
            System.out.println("Numero incorrecto vuelve a probar: ");
            adivinarNumero = scanner.nextInt();
        }
        scanner.close();
    System.out.println("!Enhorabuena¡");
    }
}
