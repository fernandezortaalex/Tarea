// Escribe un programa que gestione las puntuaciones de los jugadores en un videojuego utilizando dos arrays: uno para los nombres de los jugadores y otro para sus respectivas puntuaciones. El programa debe funcionar de la siguiente manera:

// Crea dos arrays:

// Uno para almacenar los nombres de los últimos 5 jugadores.
// Otro para almacenar las puntuaciones correspondientes de esos jugadores.
// El programa debe mostrar un menú con las siguientes opciones:

// Añadir un nuevo jugador y su puntuación: El usuario debe poder ingresar el nombre del jugador y su puntuación. La información del jugador más antiguo (el primer elemento de ambos arrays) debe ser eliminada y los nuevos datos deben añadirse al final de ambos arrays.
// Mostrar los jugadores y sus puntuaciones actuales: Se deben mostrar los nombres de los jugadores junto con sus respectivas puntuaciones.
// Salir del programa: Terminar la ejecución del programa.
// Ejecución continua: El programa debe seguir ejecutándose hasta que el usuario seleccione la opción de salir.
package Tarea_Programacion.Tema4.ud2.relacion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array jugadores
        ArrayList<String> nombreJugadores = new ArrayList<>(Arrays.asList("Jugador1", "Jugador2", "Jugador3", "Jugador4", "Jugador5"));
        //Array puntuacion jugadores
        ArrayList<Integer> puntuacionJugadores= new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        int opcionMenu;

        System.out.println("Elige la opcion que quieras escoger:\n1.Añadir un nuevo jugador y su puntuación:\n2.Mostrar los jugadores y sus puntuaciones actuales:\n3.Salir del programa:");
        opcionMenu = scanner.nextInt();

        if (opcionMenu == 1) {
            
        }
    }
}
