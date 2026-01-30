// Escribe un programa que permita al usuario ingresar las temperaturas registradas durante una semana (7 días). Una vez ingresadas las temperaturas, el programa debe mostrar al usuario un menú con las siguientes opciones:

// Mostrar la temperatura más alta registrada.
// Mostrar la temperatura más baja registrada.
// Calcular la temperatura promedio de la semana.
// Salir del programa.
// El programa debe ejecutarse hasta que el usuario elija la opción de salir.
package Tarea_Programacion.Tema4.ud2.relacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1Funcion {
    // Array para introducir las temperaturas
    public static void introducirTemperaturas(ArrayList<Double> array, Scanner sc) {
        int diaSemana = 1;
        double datoIntroducido;
        for (int i = 0; i < 7; i++) {
            try {
                mostrarMensaje("Introduce la temperatura del dia " + diaSemana);
                datoIntroducido = Double.parseDouble(sc.nextLine());
                array.add(datoIntroducido);
                diaSemana++;
            } catch (NumberFormatException e) {
                mostrarMensaje("Opcion no valida, introduce un numero.");
                i--;
            }
        }
        
    }

    //Menu
    public static int mostrarMenuYLeerOpcion(Scanner sc) {
        int opcion = 0;
        do {
                try {
                    mostrarMensaje( "Que opcion quieres elegir:\n1.Mostrar la temperatura más alta registrada.\n2.Mostrar la temperatura más baja registrada.\n3.Calcular la temperatura promedio de la semana.\n4.Salir del programa.");
                    opcion = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    mostrarMensaje("Error introduce un numero");
                    opcion = -1;
                }
            } while (opcion < 1 || opcion > 4);
        return opcion;
    }
    
    //Opcion1 (Numero mas grande en el array)
    public static double datoMasAlto(ArrayList<Double> array) {
        double valorMasAlto = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > valorMasAlto) {
                valorMasAlto = array.get(i);
            }
        }
        return valorMasAlto;
    }

    //Opcion2 (Numero mas bajo en el array)
    public static double datoMasBajo(ArrayList<Double> array) {
        double valorMasBajo = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < valorMasBajo) {
                valorMasBajo = array.get(i);
            }
        }
        return valorMasBajo;
    }

    //Opcion3 (Calcular promedio)
    public static double sumarArraydouble(ArrayList<Double> array) {
        double suma = 0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        return suma;
    }

    public static double mediaArrayDouble(ArrayList<Double> array) {
        double media = 0;
        if (array.size() > 0) {
            media = (double) sumarArraydouble(array) / array.size();
        }
        return media;
    }

    //Funcion para mostrar un mensaje
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // arrays
        ArrayList<Double> temperaturas = new ArrayList<>();

        // variables
        int opciones = 0;
        double temperaturaPromedio = 0;
        double temperaturaMasAlta, temperaturaMasBaja;
        
        // Pido temperatura durante 7 dias
        introducirTemperaturas(temperaturas, scanner);
        System.out.println(temperaturas);

        do {
            // Mostrar opciones
            opciones = mostrarMenuYLeerOpcion(scanner);

            if (opciones == 1) {
                // Temperatura mas alta
                temperaturaMasAlta =  datoMasAlto(temperaturas);
                mostrarMensaje("La temperatura mas alta es: " + temperaturaMasAlta);
                
            } else if (opciones == 2) {
                // Temperatura mas baja
                temperaturaMasBaja = datoMasBajo(temperaturas);
                mostrarMensaje("La temperatura mas baja es: " + temperaturaMasBaja);
            } else if (opciones == 3) {
                // Temperatura promedio
                temperaturaPromedio = mediaArrayDouble(temperaturas);
                mostrarMensaje("La temperatura promedio es: " + temperaturaPromedio);
            }
        } while (opciones != 4);
        scanner.close();

    }
}
