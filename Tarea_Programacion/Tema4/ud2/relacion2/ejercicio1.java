// Escribe un programa que permita al usuario ingresar las temperaturas registradas durante una semana (7 días). Una vez ingresadas las temperaturas, el programa debe mostrar al usuario un menú con las siguientes opciones:

// Mostrar la temperatura más alta registrada.
// Mostrar la temperatura más baja registrada.
// Calcular la temperatura promedio de la semana.
// Salir del programa.
// El programa debe ejecutarse hasta que el usuario elija la opción de salir.
package Tarea_Programacion.Tema4.ud2.relacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // arrays
        ArrayList<Double> temperaturas = new ArrayList<>();

        // variables
        int diaSemana = 1;
        int opciones = 0;
        double sumaTemperaturas = 0;
        double temperaturaPromedio = 0;
        double datoIntroducido, temperaturaMasAlta, temperaturaMasBaja;

        // Pido temperatura durante 7 dias
        for (int i = 0; i < 7; i++) {
            System.out.println("Introduce la temperatura del dia " + diaSemana);
            datoIntroducido = scanner.nextDouble();
            diaSemana++;

            temperaturas.add(datoIntroducido);

        }
        System.out.println(temperaturas);

        // Mostrar opciones
        do {
            //Preguntar porque no funciona
            try {
                System.out.println( "Que opcion quieres elegir:\n1.Mostrar la temperatura más alta registrada.\n2.Mostrar la temperatura más baja registrada.\n3.Calcular la temperatura promedio de la semana.\nSalir del programa.");
                opciones = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Error introduce un numero");
                
            }

            if (opciones == 1) {
                // Temperatura mas alta
                temperaturaMasAlta = temperaturas.get(0);
                for (int i = 0; i < temperaturas.size(); i++) {
                    if (temperaturas.get(i) > temperaturaMasAlta) {
                        temperaturaMasAlta = temperaturas.get(i);
                    }
                }
                System.out.println(temperaturaMasAlta);
            } else if (opciones == 2) {
                // Temperatura mas baja
                temperaturaMasBaja = temperaturas.get(0);
                for (int i = 0; i < temperaturas.size(); i++) {
                    if (temperaturas.get(i) < temperaturaMasBaja) {
                        temperaturaMasBaja = temperaturas.get(i);
                    }
                }
                System.out.println(temperaturaMasBaja);
            } else if (opciones == 3) {
                // Temperatura promedio
                for (Double temperaturaDouble : temperaturas) {
                    sumaTemperaturas += temperaturaDouble;
                }
                temperaturaPromedio = sumaTemperaturas / temperaturas.size();
                System.out.println(temperaturaPromedio);
            }
        } while (opciones != 4);

    }
}
