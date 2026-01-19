package Tarea_Programacion.Tema4.examenes;

import java.util.ArrayList;
import java.util.Scanner;

public class pt2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        // Arrays
        ArrayList<Integer> tableroInterno = new ArrayList<>();
        ArrayList<String> tableroVisible = new ArrayList<>();

        // Constantes
        final int NUMDIENTES = 10;
        final int MAXDIENTESPICADOS = 5;
        final int DIENTESPICADOS = (int) ((Math.random() * MAXDIENTESPICADOS) + 1);
        final int DIENTESNOPICADOS = NUMDIENTES - DIENTESPICADOS;
        final String JUGADOR1 = "Jugador1";
        final String JUGADOR2 = "Jugador2";
        final String DIENTE = "D";
        final String DIENTESANO = "DS";
        final String DIENTEDANIADO = "M";

        // Variables
        boolean juegoPerdido = false;
        String jugadorActual = JUGADOR1;
        String mensajeFinPrograma = "Enhorabuena, ambos ganan";
        int posicionSeleccionada = 0;
        int dientesPicadosIntroducidos = 0;
        int posicionDienteIntroducir = 0;
        boolean valido = true;

        // Inicio Programa

        // Introduzco tantos 0 como numero de dientes haya
        for (int i = 0; i < NUMDIENTES; i++) {
            tableroInterno.add(0);
        }

        // Bucle para Introducir los dientes picados
        while (dientesPicadosIntroducidos < DIENTESPICADOS) {
            posicionDienteIntroducir = (int) ((Math.random() * NUMDIENTES) + 1);
            if (tableroInterno.get(posicionDienteIntroducir) == 0) {
                tableroInterno.set(posicionDienteIntroducir, 1);
                dientesPicadosIntroducidos++;
            }
        }

        /*Bucle para añadir al tablero visible tantos dientes como posiciones haya en el array*/
        for (int i = 0; i < NUMDIENTES; i++) {
            tableroVisible.add(DIENTE);
        }
        System.out.println(tableroVisible);

        for (int i = 0; i < DIENTESNOPICADOS && !juegoPerdido; i++) {
            // Jugador introduce la posicion que quiere
            do {
                try {
                    System.out.println(jugadorActual + " elige: ");
                    posicionSeleccionada = Integer.parseInt(scanner1.nextLine()); 
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error introduce un numero");
                    valido = false;
                }
            } while (tableroVisible.get(posicionSeleccionada) != DIENTE || (posicionSeleccionada < 0 || posicionSeleccionada > NUMDIENTES) || !valido );

            // Comparo la opcion introducida por el usuario con el tablero Interno
            if (tableroInterno.get(posicionSeleccionada) == 0) {
                tableroVisible.set(posicionSeleccionada, DIENTESANO);
            } else {
                tableroVisible.set(posicionSeleccionada, DIENTEDANIADO);
                System.out.println("¡El cocodrilo mordió! " + jugadorActual + " pierde.");
                scanner1.nextLine();
                mensajeFinPrograma = scanner1.nextLine();
                juegoPerdido = true;
            }
            System.out.println(tableroVisible);

            // Cambio de jugador
            if (jugadorActual == JUGADOR1) {
                jugadorActual = JUGADOR2;
            } else {
                jugadorActual = JUGADOR1;
            }

        }
        System.out.println(mensajeFinPrograma);
    }
}
