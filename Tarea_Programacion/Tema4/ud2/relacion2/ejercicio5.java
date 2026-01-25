// Desarrolla un programa que permita registrar y gestionar las calificaciones de los estudiantes en una clase. Usa dos arrays: uno para los nombres de los estudiantes y otro para sus calificaciones. El programa debe ofrecer al usuario un menú con las siguientes opciones:

// Añadir un estudiante y su calificación.
// Mostrar la calificación promedio de la clase.
// Mostrar la calificación más alta y el nombre del estudiante correspondiente.
// Mostrar la calificación más baja y el nombre del estudiante correspondiente.
// Salir del programa.
package Tarea_Programacion.Tema4.ud2.relacion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays
        ArrayList<String> nombreEstudiantes = new ArrayList<>(Arrays.asList("Juan", "Pedro", "Alex", "Iker"));
        ArrayList<Double> calificacionesEstudiantes = new ArrayList<>(Arrays.asList(5.5, 10.4, 35.4, 20.2));
        int opcion = 0;
        //Opcion1
        String nombreEstudianteAñadir;
        Double calificacion;
        // Opcion 2
        double suma = 0.0; 
        Double promedio;
        // Opcion 3
        Double calificacionMasAlta = calificacionesEstudiantes.get(0);
        String nombreCalificacionMasAlta = nombreEstudiantes.get(0);
        // Opcion 4
        Double calificacionMasBaja = calificacionesEstudiantes.get(0);
        String nombreCalificacionMasBaja = nombreEstudiantes.get(0);

        
        do {
            try {
                System.out.println("1. Añadir estudiante.\n" + //
                                "2. Ver media.\n" + //
                                "3. Nota más alta.\n" + //
                                "4. Nota más baja.\n" + //
                                "5. Salir.");
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error introduce un numero\n" + 
                    "1. Añadir estudiante.\n" + //
                                "2. Ver media.\n" + //
                                "3. Nota más alta.\n" + //
                                "4. Nota más baja.\n" + //
                                "5. Salir.");
            }
            scanner.nextLine();
            //Añadir nombre y calificacion
            if (opcion == 1) {
                System.out.println("Nombre del estudiante a añadir: ");
                nombreEstudianteAñadir = scanner.nextLine();
                nombreEstudiantes.add(nombreEstudianteAñadir);
    
                System.out.println("Calificacion: ");
                calificacion = scanner.nextDouble();
                calificacionesEstudiantes.add(calificacion);
                // System.out.println(nombreEstudiantes);
                // System.out.println(calificacionesEstudiantes);
            }else if (opcion == 2) {
                for (int i = 0; i < calificacionesEstudiantes.size(); i++) {
                    suma += calificacionesEstudiantes.get(i);
                }
                promedio = suma / calificacionesEstudiantes.size();
                System.out.println(suma);
                System.out.println(promedio);
            }else if (opcion == 3) {
                for (int i = 0; i < calificacionesEstudiantes.size(); i++) {
                    if (calificacionesEstudiantes.get(i) > calificacionMasAlta) {
                        calificacionMasAlta = calificacionesEstudiantes.get(i);
                        nombreCalificacionMasAlta = nombreEstudiantes.get(i);
                    }
                }
                System.out.println(calificacionMasAlta);
                System.out.println(nombreCalificacionMasAlta);
            }else if (opcion == 4) {
                for (int i = 0; i < calificacionesEstudiantes.size(); i++) {
                    if (calificacionesEstudiantes.get(i) < calificacionMasBaja) {
                        calificacionMasBaja = calificacionesEstudiantes.get(i);
                        nombreCalificacionMasBaja = nombreEstudiantes.get(i);
                    }
                }
                System.out.println(calificacionMasBaja);
                System.out.println(nombreCalificacionMasBaja);
            }
            
        } while (opcion != 5);
        scanner.close();
    }
}
