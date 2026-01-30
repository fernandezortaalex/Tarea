package Tarea_Programacion.Tema4.ud3.relacion0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class examen {
    //Menu
    public static int mostrarMenuYLeerOpcion(Scanner sc) {
        int opcion = 0;
        do {
                try {
                    mostrarMensaje( "Que opcion quieres elegir:\n1.Añadir estudiante.\n2.Mostrar listado completo\n3.Mostrar estudiante con mas nota y con mas asistencia.\n4.Eliminar estudiante.\n5.Salir.");
                    opcion = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    mostrarMensaje("Error introduce un numero");
                    opcion = -1;
                }
            } while (opcion < 1 || opcion > 5);
        return opcion;
    }
    //Opcion1
    public static Double pedirNotaValida(Scanner sc) {
        Double aniadirNota;
        mostrarMensaje("Nota del estudiante: ");
        datoIntroducido = Double.parseDouble(sc.nextLine());
        do {
            
        } while (aniadirNota <= 0 );
        if (aniadirNota <= 0) {
            mostrarMensaje("Introduce una nota valida: ");
        } else {
            
        }
    }

    //Opcion2
    public static void mostrarListado(ArrayList<String> arrayNombres, ArrayList<Double> arrayNotas, ArrayList<Integer> arrayAsistencias, String caracterSeparador) {
        String mensaje = "";
        //Hacer control de errores
        for (int i = 0; i < arrayNombres.size(); i++) {
            mensaje += arrayNombres.get(i) + caracterSeparador + "Nota: " + arrayNotas.get(i) + caracterSeparador + " Asistencia: " + arrayAsistencias.get(i) + "\n";
        }
        mensaje = mensaje.substring(0, mensaje.length() - caracterSeparador.length());
        mostrarMensaje(mensaje);
    }

    //Opcion3
    public static void mostrarMejores(ArrayList<String> arrayNombres, ArrayList<Double> arrayNotas, ArrayList<Integer> arrayAsistencias) {
        //Poner control de errores
        String mejorAlumno = arrayNombres.get(0);
        Double mejorNota = arrayNotas.get(0);
        int mayorAsistencia = arrayAsistencias.get(0);
        String alumnoMayorAsistencia = arrayNombres.get(0);

        for (int i = 1; i < arrayNombres.size(); i++) {
            if (arrayNotas.get(i) > mejorNota) {
                mejorNota = arrayNotas.get(i);
                mejorAlumno = arrayNombres.get(i);
            }
            if (arrayAsistencias.get(i) > mayorAsistencia) {
                mayorAsistencia = arrayAsistencias.get(i);
                alumnoMayorAsistencia = arrayNombres.get(i);
            }
        }

        mostrarMensaje("Mejor nota: " + mejorAlumno + " (" + mejorNota + ") \n" + "Mayor asistencia: " + alumnoMayorAsistencia + " (" + mayorAsistencia + ")");
    }

    //Opcion4
    public static int buscarEsudiante(ArrayList<String>array, String buscar) {
        int posicion = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equalsIgnoreCase(buscar)) {
                posicion = i;
            } 
        }
        return posicion;
    }

    //Funcion para mostrar un mensaje
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Alex", "Pablo", "Iker"));
        ArrayList<Double> notas = new ArrayList<>(Arrays.asList(5.0, 10.0, 6.1));
        ArrayList<Integer> asistencias = new ArrayList<>(Arrays.asList(5, 10, 15));

        int opcion = 0;
        String aniadirEstudiante;
        Double aniadirNota;
        int aniadirAsistencia;
        String borrarAlumno;
        int posicionEstudiante;
        
        do {
            opcion = mostrarMenuYLeerOpcion(scanner);
            //Añadir estudiante
            if (opcion == 1) {
                //Añadir control errores 
                System.out.println("Nombre del estudiante: ");
                aniadirEstudiante = scanner.nextLine();
                pedirNotaValida(scanner);
                
                System.out.println("Cantidad de asistencia: ");
                aniadirAsistencia = scanner.nextInt();
                
                nombres.add(aniadirEstudiante);
                notas.add(aniadirNota);
                asistencias.add(aniadirAsistencia);
                System.out.println(nombres);
                System.out.println(notas);
                System.out.println(asistencias);
            }else if (opcion == 2) {
                mostrarListado(nombres, notas, asistencias, "-");
            }else if (opcion == 3) {
                mostrarMejores(nombres, notas, asistencias);
            }else if (opcion == 4) {
                System.out.println("Dime el alumno que quieres borrar: ");
                borrarAlumno = scanner.nextLine();
                posicionEstudiante = buscarEsudiante(nombres, borrarAlumno);
                if (posicionEstudiante == -1) {
                    System.out.println("No se ha encontrado al estudiante");
                }else{
                    nombres.remove(posicionEstudiante);
                    notas.remove(posicionEstudiante);
                    asistencias.remove(posicionEstudiante);
                }
                System.out.println(nombres);
                System.out.println(notas);
                System.out.println(asistencias);
            }
            
        } while (opcion != 5);
    }
}
