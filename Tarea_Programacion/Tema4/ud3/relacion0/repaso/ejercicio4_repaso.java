package Tarea_Programacion.Tema4.ud3.relacion0.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4_repaso {
    /////////////////////////////////////////Funciones generales///////////////////////

    /**
    * Para introducir un menu
    * @param sc
    * @param min Numero minimo que se puede introducir
    * @param max numero maximo que se puede introducir
    * @return Si lo has introducido bien el numero que te devuelve
    */
    public static int mostrarMenuYLeerOpcion(Scanner sc, int min, int max, String mensajeOpciones) {
        int opcion = 0;
        do {
            try {
                mostrarMensaje(mensajeOpciones);
                opcion = Integer.parseInt(sc.nextLine());
                if (opcion > max || opcion < min) {
                    mostrarMensaje("Error el numero tiene que estar entre " + min + " y " + max);
                }
            } catch (NumberFormatException e) {
                mostrarMensaje("Error introduce un numero");
                opcion = -1;
            }
        } while (opcion < min || opcion > max);
        return opcion;
    }

    public static void mostrarMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Arrays
         */
        ArrayList<String> nombreArray = new ArrayList<>(Arrays.asList("TechNova", "BioSalud", "EducaPlus", "RetailLink"));
        ArrayList<Integer> nombreArrayint = new ArrayList<>(Arrays.asList(6, 7, 3, 5));

        int opcion = 0;

        do {
            opcion = mostrarMenuYLeerOpcion(scanner, 0, 8, "Que opcion quieres elegir:\n1.Añadir tractor.\n2.Listar tractores\n3.Evaluar tractor (por índice).\n4.Eliminar tractor.\n0.Salir.");
            
        } while (opcion >= 0);
    }
}
