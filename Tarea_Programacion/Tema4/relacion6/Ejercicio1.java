package Tarea_Programacion.Tema4.relacion6;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creo las variables
        int calificacion;
        int numeroAlumno = 1;
        double sumatorio = 0;
        int aprobados = 0;
        int suspensos = 0;
        double media = 0;

        System.out.println("Introduce la calificacion del alumno " + numeroAlumno + ": ");
        calificacion = scanner.nextInt();
        

        while (calificacion != -1) {
            sumatorio += calificacion; 
            numeroAlumno++;

            if (calificacion >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }

            System.out.println("Introduce la calificacion del alumno " + numeroAlumno + ": ");
            calificacion = scanner.nextInt();
        }
        scanner.close();
        

        if (numeroAlumno > 1) {
            //Preguntar porque no me aparece con decimales
            //Le quito 1 alumno porque comienza en 1 para el contador 
            media = sumatorio / (numeroAlumno - 1);
            System.out.println("Han aprobado: " + aprobados + " y han suspendido: " + suspensos + " con una media en total de: " + media);
            
        } else {
            System.out.println("No se ha introducido ninguna calificacion");
        }

    }
}
