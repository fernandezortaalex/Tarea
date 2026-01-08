package Tarea_Programacion.Tema4.relacion1;

import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        //Cada vez que le vaya a introducir un valor tengo que decirle que tipo de dato es
        System.out.println("¿Cuántos caramelos tienes?: ");
        int caramelos = scanner1.nextInt();
        
        System.out.println("¿Cuántos niños hay?: ");
        int ninos = scanner1.nextInt();

        int carameloPorNino = caramelos / ninos;
        int restoCaramelos = caramelos % ninos;

        System.out.println("A cada niño le toca " + carameloPorNino + " y sobran " + restoCaramelos + " caramelos.");
        scanner1.close();
    }
}
