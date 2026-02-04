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

    //Opcion 1
    /**
     * Lee un string y comprueba que no este vacio
     * @param mensaje
     * @param sc
     * @return devuelve el string
     */
    public static String leerStringNoVacio(String mensaje, Scanner sc) {
        String texto;
        do {
            mostrarMensaje(mensaje);
            texto = sc.nextLine();
            if (texto.isEmpty()) {
                mostrarMensaje("Por favor introduzca texto y no lo dejes vacio");
            }
        } while (texto.isEmpty());
        return texto;
    }
    /**
     * Esta funcion solo deja introducir numeros enteros a un array y no para de preguntar
     * hasta que introduces un numero valido.
     * @param array Array donde añadir el numero
     * @param sc 
     */
    public static Double validarPotencia(ArrayList<Double>array, Scanner sc, String mensaje) {
        double numero = 0;
        boolean valido = false;
        do {
            try {
                mostrarMensaje(mensaje);
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
        return numero;
    }
    //ESTA FUNCION SOLO DEJA INTRODUCIR AL ARRAY CIERTOS NOMBRES, SE REPITE HASTA QUE SE LO PONGAS
/**
     * Valida que la opcion introducida sea una de las declaradas
     * @param array Array donde se van a guardar los datos
     * @param sc
     */
    public static void validarTrabajo(ArrayList<String> array, Scanner sc, String mensaje) {
        String trabajo;
        boolean valido = false;
        do {
            mostrarMensaje(mensaje);
            trabajo = sc.nextLine();
            if (trabajo.equalsIgnoreCase("llano") || trabajo.equalsIgnoreCase("mixto") || trabajo.equalsIgnoreCase("montaña")) {
                array.add(trabajo);
                valido = true;
            }else{
                mostrarMensaje("Introduce un trabajo valido");
            }
        
        } while (!valido);
    }

    //Opcion 2

    /**
     * Muestra un listado en orden de cada array, con su respectivo elemento de otro array
     * @param arrayNombres
     * @param arrayPotenciaVehiculo
     * @param arrayTrabajoRealizar
     * @param caracterSeparador Caracter con el que quieras que se separen 
     */
    public static void mostrarListado(ArrayList<String> arrayNombres, ArrayList<Double> arrayKilometros, ArrayList<Double> arrayLitros, ArrayList<String> arrayTerreno, String caracterSeparador) {
        int contador = 0;
        String mensaje = "";
        //Hacer control de errores
        if (arrayNombres.isEmpty()) {
            mostrarMensaje("Error no hay nada en el array");
        } else {
            for (int i = 0; i < arrayNombres.size(); i++) {
                mensaje += contador + "->" + arrayNombres.get(i) + caracterSeparador  + arrayKilometros.get(i) + " KM " + caracterSeparador  + arrayLitros.get(i) + " L " + caracterSeparador +  " terreno: " + arrayTerreno.get(i) + "\n";
            }
            mensaje = mensaje.substring(0, mensaje.length() - caracterSeparador.length());
            mostrarMensaje(mensaje);
            
        }
    }

    //Opcion 3
    //INTRODUCES UN NUMERO Y SI ESTA EN EL ARRAY TE DEVUELVE ESE NUMERO, SI NO TE VUELVE 
    //A PREGUNTAR.
    //ESTA VACIO TE SALTA UN MENSAJE
    /**
         * Sirve para verificar que el numero introducido es una posicion existente en el array
         * @param array Array donde verificar
         * @param sc 
         * @return devuelve la posicion
         */
    public static int verificarNumeroEnArray(ArrayList<String>array, Scanner sc) {
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
        
        

    public static void aptoNoApto(int numeroValidar,ArrayList<String> arrayNombres, ArrayList<Double> arrayKilometros, ArrayList<Double> arrayLitros, ArrayList<String> arrayTerreno) {
        //Comprobar el trabajo del vehiculo y despues comprobar su potencia y decir si es apto o no
        double litrosNecesariosLlano = arrayKilometros.get(numeroValidar) * 0.12;
        double litrosNecesariosMixto = arrayKilometros.get(numeroValidar) * 0.18;
        double litrosNecesariosMontaña = arrayKilometros.get(numeroValidar) * 0.25;
        String mensaje = arrayNombres.get(numeroValidar) + " Apto " + obtenerFraseApto();
        if (arrayTerreno.get(numeroValidar).equalsIgnoreCase("llano") && litrosNecesariosLlano <= arrayLitros.get(numeroValidar)) {
            mostrarMensaje(mensaje);
            
        }else if (arrayTerreno.get(numeroValidar).equalsIgnoreCase("mixto") && litrosNecesariosMixto <= arrayLitros.get(numeroValidar)) {
            mostrarMensaje(mensaje);
            
        }else if (arrayTerreno.get(numeroValidar).equalsIgnoreCase("montaña") && litrosNecesariosMontaña <= arrayLitros.get(numeroValidar)) {
            mostrarMensaje(mensaje);
            
        }else{
            mostrarMensaje(arrayNombres.get(numeroValidar) + " no Apto " + obtenerFraseNoApto());
            
        }
    }
    //CREA UN NUMERO ALEATORIO Y SEGUN EL NUMERO QUE SALGA TE SALE UN MENSAJE U OTRO
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
    //CREA UN NUMERO ALEATORIO Y SEGUN EL NUMERO QUE SALGA TE SALE UN MENSAJE U OTRO
    public static String obtenerFraseNoApto() {
        Double aleatorio = Math.random();
        String mensaje = "";
        if (aleatorio < 0.5) {
            mensaje = "El vehiculo no sirve crack";
        }else{
            mensaje = "El vehiculo no sirve y esta guapo";
        }
        return mensaje;
    }

    //Opcion4
    public static void eliminarElementos(int numero,ArrayList<String> arrayNombres, ArrayList<Double> arrayKilometros, ArrayList<Double> arrayLitros, ArrayList<String> arrayTerreno) {
        arrayNombres.remove(numero);
        arrayKilometros.remove(numero);
        arrayLitros.remove(numero);
        arrayTerreno.remove(numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Arrays
         */
        ArrayList<String> tractor = new ArrayList<>(Arrays.asList("TechNova", "BioSalud", "EducaPlus", "RetailLink"));
        ArrayList<Double> kilometros = new ArrayList<>(Arrays.asList(1250.5, 890.2, 2100.0, 100.0));
        ArrayList<Double> litrosDisponibles = new ArrayList<>(Arrays.asList(120.5, 85.0, 310.2, 50.0));
        ArrayList<String> tipoTerrreno = new ArrayList<>(Arrays.asList("llano", "mixto", "montaña", "llano"));

        int opcion = 0;
        //Opcion1
        int numeroAEvaluar = 0;

        do {
            opcion = mostrarMenuYLeerOpcion(scanner, 0, 4, "Que opcion quieres elegir:\n1.Añadir ruta.\n2.Listar rutas\n3.Calcular consumo (por índice).\n4.Eliminar ruta.\n0.Salir.");
            if (opcion == 1) {
                tractor.add(leerStringNoVacio("Dime la marca del tractor a añadir: ", scanner));
                validarPotencia(kilometros, scanner, "Introduce los kilometros: ");
                validarPotencia(litrosDisponibles, scanner, "Introduce la cantidad de litros que necesita: ");
                validarTrabajo(tipoTerrreno, scanner, "Va a ser para llano, mixto o montaña: ");
            }else if (opcion == 2) {
                mostrarListado(tractor, kilometros, litrosDisponibles, tipoTerrreno, " | ");
            }else if (opcion == 3) {
                numeroAEvaluar = -1;
                numeroAEvaluar = verificarNumeroEnArray(tractor, scanner);
                if (numeroAEvaluar != -1) {
                    aptoNoApto(numeroAEvaluar,tractor, kilometros, litrosDisponibles, tipoTerrreno);
                } else {
                    mostrarMensaje("No hay tractores para evaluar");
                }
            }else if (opcion == 4) {
                numeroAEvaluar = -1;
                numeroAEvaluar = verificarNumeroEnArray(tractor, scanner);
                if (numeroAEvaluar != -1) {
                    eliminarElementos(numeroAEvaluar,tractor, kilometros, litrosDisponibles, tipoTerrreno);
                } else {
                    mostrarMensaje("No hay tractores para evaluar");
                }
            }
        } while (opcion != 0);
        scanner.close();
    }
}
