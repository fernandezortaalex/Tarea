package Tarea_Programacion.Tema4.ud3.relacion0.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    // menu
    public static int mostrarMenuYLeerOpcion(Scanner sc) {
        int opcion = 0;
        do {
                try {
                    imprimirMensaje( "Que opcion quieres elegir:\n1.Añadir revisión.\n2.Listar revisiones\n3.Mostrar coste (por índice).\n4.Eliminar revisión.\n0.Salir.");
                    opcion = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    imprimirMensaje("Error introduce un numero");
                    opcion = -1;
                }
            } while (opcion < 0 || opcion > 4);
        return opcion;
    }

    //Opcion1
    public static void aniadirMatricula(ArrayList<String> array, Scanner sc) {
        String matricula;
        imprimirMensaje("Introduce la matricula a añadir: ");
        matricula = sc.nextLine();
        array.add(matricula);
    }
    //ESTA FUNCION SOLO DEJA INTRODUCIR AL ARRAY CIERTOS NOMBRES, SE REPITE HASTA QUE SE LO PONGAS
    public static void tipoRevision(ArrayList<String> array, Scanner sc) {
        String trabajo;
        boolean valido = false;
        do {
            imprimirMensaje("Va a ser basica o completa: ");
            trabajo = sc.nextLine();
            if (trabajo.equalsIgnoreCase("basica") || trabajo.equalsIgnoreCase("completa") ) {
                array.add(trabajo);
                valido = true;
            }else{
                imprimirMensaje("Introduce un tipo de revision valido");
            }
        
        } while (!valido);
    }
    public static void validarPotencia(ArrayList<Integer>array, Scanner sc) {
        int numero;
        boolean valido = false;
        do {
            try {
                imprimirMensaje("Cuantos extras le vas a poner: ");
                numero = Integer.parseInt(sc.nextLine());
                if (numero >= 0) {
                    array.add(numero);
                    valido = true;
                }else{
                    imprimirMensaje("Introduce un numero valido");
                }
                
            } catch (NumberFormatException e) {
                imprimirMensaje("Introduce un numero");
            }
            
        } while (!valido);
    }
    public static int calcularCoste(ArrayList<String>arrayRevision) {
        //Sirve para segun la opcion elegida sumarle una cantidad y otra, no hay control de errores pq ya se comprobo en la otra funcion
        String trabajo = arrayRevision.get(arrayRevision.size() - 1);
        int precio = 0;
        if (trabajo.equalsIgnoreCase("basica")) {
            precio += 60;
        }else{
            precio += 120;
        }
        return precio;
    }
    public static int calcularExtra(ArrayList<Integer>arrayExtras) {
        //Sirve sumar 15 segun el numero del ultimo elemento del array
        int precio = 0;
        for (int i = 0; i < arrayExtras.get(arrayExtras.size() - 1); i++) {
            precio += 15;
        }
        return precio;
    }
    //preguntar como comprobar si un caracter es un numero
    //lo busco en el modelo ascii y le resto 0 para que me de el numero
    // public static void descuento(ArrayList<String>array) {
    //     String matriculaRevisar = array.get(array.size() - 1);
    //     char ultimoNumero = matriculaRevisar.charAt(matriculaRevisar.length() - 1);
    //     int convertirNumero = 0;
    //     try {
    //         convertirNumero = Integer.parseInt(matriculaRevisar.charAt(matriculaRevisar.length() - 1));
    //         if (ultimoNumero % 2 == 0) {
    //             imprimirMensaje("Obtienes descuemto");
    //         }else{
    //             imprimirMensaje("No tienes descuento");
    //         }
            
    //     } catch (NumberFormatException e) {
    //         imprimirMensaje("No tienes descuento");
    //     }
    // }

    //Opcion2
    public static void mostrarListado(ArrayList<String> arrayNombres, ArrayList<String> arrayRevision, ArrayList<Integer> arrayServiciosExtras, ArrayList<Integer> arrayCosteFinal, String caracterSeparador) {
        String mensaje = "";
        int contador = 0;
        //Hacer control de errores
        if (arrayNombres.size() == 0) {
            imprimirMensaje("Error no hay nada en el array");
        } else {
            for (int i = 0; i < arrayNombres.size(); i++) {
                mensaje += contador + "->" + arrayNombres.get(i) + caracterSeparador  + arrayRevision.get(i) + caracterSeparador + " extras: " + arrayServiciosExtras.get(i) + caracterSeparador + " coste: " + arrayCosteFinal.get(i) + "\n";
                contador++;
            }
            mensaje = mensaje.substring(0, mensaje.length() - caracterSeparador.length());
            imprimirMensaje(mensaje);
            
        }
    }

    //Opcion3
    public static int pedirIndice(ArrayList<String>array, Scanner sc) {
        int numero = -1;
        if (array.size() != 0) {
            do {
                try {
                    imprimirMensaje("Dime el numero del Vehiculo: ");
                    numero = Integer.parseInt(sc.nextLine());
                    
                    
                } catch (NumberFormatException e) {
                    imprimirMensaje("Introduce un numero");
                    numero = -1;
                }
                
            } while (numero < 0 || numero >= array.size());
        } 
        return numero;
    }

    //Opcion4
    public static void eliminarVehiculo(ArrayList<String> arrayNombres, ArrayList<String> arrayRevision, ArrayList<Integer> arrayServiciosExtras, ArrayList<Integer> arrayCosteFinal, int numero) {
        arrayNombres.remove(numero);
        arrayRevision.remove(numero);
        arrayServiciosExtras.remove(numero);
        arrayCosteFinal.remove(numero);
        imprimirMensaje("Vehiculo eliminado");
    }

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> matricula= new ArrayList<>(Arrays.asList("0000BBB", "1234ABC", "9999ZZZ"));
        ArrayList<String> revision= new ArrayList<>(Arrays.asList("basica", "completa", "basica"));
        ArrayList<Integer> serviciosExtras= new ArrayList<>(Arrays.asList(3, 4, 0));
        ArrayList<Integer> costeFinal= new ArrayList<>(Arrays.asList(3000, 2500, 1000));

        int opcion = 0;
        //opcion1
        int costesRevision = 0;
        int costesServiciosExtras = 0;
        int costesTotales = 0;
        int numeroAEvaluar = 0;
        do {
            
            opcion = mostrarMenuYLeerOpcion(scanner);
            if (opcion == 1) {
                costesRevision = 0;
                costesServiciosExtras = 0;
                aniadirMatricula(matricula, scanner);
                tipoRevision(revision, scanner);
                validarPotencia(serviciosExtras, scanner);
                costesRevision = calcularCoste(revision);
                costesServiciosExtras = calcularExtra(serviciosExtras);
                costesTotales = costesRevision + costesServiciosExtras;
                costeFinal.add(costesTotales);
                //Comprobar que esta bien puesto
                System.out.println(matricula);
                System.out.println( revision);
                System.out.println( serviciosExtras);
                System.out.println( costeFinal);
            }else if (opcion == 2) {
                mostrarListado(matricula, revision, serviciosExtras, costeFinal, "|");
            }else if (opcion == 3) {
                numeroAEvaluar = -1;
                numeroAEvaluar = pedirIndice(matricula, scanner);
                if (numeroAEvaluar != -1) {
                    System.out.println("El coste final ha sido " + costeFinal.get(numeroAEvaluar));
                } else {
                    System.out.println("No hay vehiculos para evaluar");
                }
            }else if (opcion == 4) {
                numeroAEvaluar = -1;
                numeroAEvaluar = pedirIndice(matricula, scanner);
                if (numeroAEvaluar != -1) {
                    eliminarVehiculo(matricula, revision, serviciosExtras, costeFinal, numeroAEvaluar);
                } else {
                    System.out.println("No hay vehiculos para eliminar");
                }
            }
        } while (opcion != 0);

    }
}
