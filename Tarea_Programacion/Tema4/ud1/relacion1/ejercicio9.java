package Tarea_Programacion.Tema4.ud1.relacion1;

import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        //Creo las variables
        int caramelos = 0;
        int ninos = 0;
        int carameloPorNino;
        int restoCaramelos;

        //Cada vez que le vaya a introducir un valor tengo que decirle que tipo de dato es
        System.out.println("¿Cuántos caramelos tienes?: ");
        caramelos = scanner1.nextInt();
        
        System.out.println("¿Cuántos niños hay?: ");
        ninos = scanner1.nextInt();
        //Cuando dejo de introducirle datos al scanner lo cierro para que no este abierto
        scanner1.close();

        carameloPorNino = caramelos / ninos;
        restoCaramelos = caramelos % ninos;

        System.out.println("A cada niño le toca " + carameloPorNino + " y sobran " + restoCaramelos + " caramelos.");
    }
}
