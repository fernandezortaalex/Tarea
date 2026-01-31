package Tarea_Programacion.Tema4.ud3.relacion0.repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    public static int mostrarMenuYLeerOpcion(Scanner sc) {
        int opcion = 0;
        do {
                try {
                    mostrarMensaje( "Que opcion quieres elegir:\n1.Añadir tractor.\n2.Listar tractores\n3.Evaluar tractor (por índice).\n4.Eliminar tractor.\n0.Salir.");
                    opcion = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    mostrarMensaje("Error introduce un numero");
                    opcion = -1;
                }
            } while (opcion < 0 || opcion > 4);
        return opcion;
    }
    //Opcion1
    public static void validarPotencia(ArrayList<Integer>array, Scanner sc) {
        int numero;
        boolean valido = false;
        do {
            try {
                mostrarMensaje("Introduce la potencia: ");
                numero = Integer.parseInt(sc.nextLine());
                if (numero > 0) {
                    array.add(numero);
                    valido = true;
                }else{
                    mostrarMensaje("Introduce un numero valido");
                }
                
            } catch (NumberFormatException e) {
                mostrarMensaje("Introduce un numero");
            }
            
        } while (!valido);
    }
    public static void validarTrabajo(ArrayList<String> array, Scanner sc) {
        String trabajo;
        boolean valido = false;
        do {
            mostrarMensaje("Va a ser para arado, transporte o siembra: ");
            trabajo = sc.nextLine();
            if (trabajo.equalsIgnoreCase("arado") || trabajo.equalsIgnoreCase("transporte") || trabajo.equalsIgnoreCase("siembra")) {
                array.add(trabajo);
                valido = true;
            }else{
                mostrarMensaje("Introduce un trabajo valido");
            }
        
        } while (!valido);
    }

    //Opcion2
    public static void mostrarListado(ArrayList<String> arrayNombres, ArrayList<Integer> arrayPotenciaVehiculo, ArrayList<String> arrayTrabajoRealizar, String caracterSeparador) {
        String mensaje = "";
        int contador = 0;
        //Hacer control de errores
        if (arrayNombres.size() == 0) {
            mostrarMensaje("Error no hay nada en el array");
        } else {
            for (int i = 0; i < arrayNombres.size(); i++) {
                mensaje += contador + "->" + arrayNombres.get(i) + caracterSeparador  + arrayPotenciaVehiculo.get(i) + " CV " + caracterSeparador + " Trabajo: " + arrayTrabajoRealizar.get(i) + "\n";
                contador++;
            }
            mensaje = mensaje.substring(0, mensaje.length() - caracterSeparador.length());
            mostrarMensaje(mensaje);
            
        }
    }
    //Opcion3
    public static int evaluarTractor(ArrayList<String>array, Scanner sc) {
        int numero = -1;
        if (array.size() != 0) {
            do {
                try {
                    mostrarMensaje("Dime el numero del tractor que quieres validar: ");
                    numero = Integer.parseInt(sc.nextLine());
                    
                    
                } catch (NumberFormatException e) {
                    mostrarMensaje("Introduce un numero");
                    numero = -1;
                }
                
            } while (numero < 0 || numero >= array.size());
        } 
        return numero;
    }
    public static void aptoNoApto(int numeroValidar,ArrayList<String> arrayNombresVehiculos, ArrayList<Integer>arrayPotenciaVehiculo, ArrayList<String> arrayTrabajoRealizar) {
        //Comprobar el trabajo del vehiculo y despues comprobar su potencia y decir si es apto o no
        if (arrayTrabajoRealizar.get(numeroValidar).equalsIgnoreCase("arado")) {
            if (arrayPotenciaVehiculo.get(numeroValidar) >= 120) {
                mostrarMensaje(arrayNombresVehiculos.get(numeroValidar) + " Apto " + obtenerFraseApto());
            }else{
                mostrarMensaje(arrayNombresVehiculos.get(numeroValidar) + " No Apto " + obtenerFraseNoApto());
            }
        }else if (arrayTrabajoRealizar.get(numeroValidar).equalsIgnoreCase("transporte")) {
            if (arrayPotenciaVehiculo.get(numeroValidar) >= 90) {
                mostrarMensaje(arrayNombresVehiculos.get(numeroValidar) + " Apto " + obtenerFraseApto());
            }else{
                mostrarMensaje(arrayNombresVehiculos.get(numeroValidar) + " No Apto " + obtenerFraseNoApto());
            }
        }else if (arrayTrabajoRealizar.get(numeroValidar).equalsIgnoreCase("siembra")) {
            if (arrayPotenciaVehiculo.get(numeroValidar) >= 70) {
                mostrarMensaje(arrayNombresVehiculos.get(numeroValidar) + " Apto " + obtenerFraseApto());
            }else{
                mostrarMensaje(arrayNombresVehiculos.get(numeroValidar) + " No Apto " + obtenerFraseNoApto());
            }
        }
    }
    public static String obtenerFraseApto() {
        Double aleatorio = Math.random();
        String mensaje = "";
        if (aleatorio < 0.5) {
            mensaje = "El vehiculo sirve crack";
        }else{
            mensaje = "El vehiculo sirve y esta guapo";
        }
        return mensaje;
    }
    public static String obtenerFraseNoApto() {
        Double aleatorio = Math.random();
        String mensaje = "";
        if (aleatorio < 0.5) {
            mensaje = "El vehiculo no sirve crack";
        }else{
            mensaje = "El vehiculo no sirve pero esta guapo";
        }
        return mensaje;
    }
    
    //Opcion4
    public static void eliminarVehiculo(int numero, ArrayList<String> arrayNombresVehiculos, ArrayList<Integer>arrayPotenciaVehiculo, ArrayList<String> arrayTrabajoRealizar) {
        arrayNombresVehiculos.remove(numero);
        arrayPotenciaVehiculo.remove(numero);
        arrayTrabajoRealizar.remove(numero);
        mostrarMensaje("Vehiculo eliminado del sistema.");
    }

    public static void mostrarMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    /////////////////////////////////MAIN//////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> marcas = new ArrayList<>();
        ArrayList<Integer> arrayPotencia = new ArrayList<>();
        ArrayList<String> arrayTrabajo = new ArrayList<>();

        int opcion = 0;
        //Opcion1
        String marcaIntroducir;
        int numeroAEvaluar;
        
        do {
            opcion = mostrarMenuYLeerOpcion(scanner);
            if (opcion == 1) {
                System.out.println("Marca: ");
                marcaIntroducir = scanner.nextLine();
                marcas.add(marcaIntroducir);
                validarPotencia(arrayPotencia, scanner);
                validarTrabajo(arrayTrabajo, scanner);
            }else if (opcion == 2) {
                mostrarListado(marcas, arrayPotencia, arrayTrabajo, "|");
            }else if (opcion == 3) {
                numeroAEvaluar = -1;
                numeroAEvaluar = evaluarTractor(marcas, scanner);
                if (numeroAEvaluar != -1) {
                    aptoNoApto(numeroAEvaluar,marcas, arrayPotencia, arrayTrabajo);
                } else {
                    System.out.println("No hay tractores para evaluar");
                }
            }else if (opcion == 4) {
                numeroAEvaluar = -1;
                numeroAEvaluar = evaluarTractor(marcas, scanner);
                if (numeroAEvaluar != -1) {
                    eliminarVehiculo(numeroAEvaluar, marcas, arrayPotencia, arrayTrabajo);
                } else {
                    System.out.println("No hay tractores para eliminar");
                }
            }
            
        } while (opcion != 0);
        scanner.close();
    }
}
