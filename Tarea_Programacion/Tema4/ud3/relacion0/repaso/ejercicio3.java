package Tarea_Programacion.Tema4.ud3.relacion0.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {
    /**
     * Para introducir un menu
     * 
     * @param sc
     * @param min Numero minimo que se puede introducir
     * @param max numero maximo que se puede introducir
     * @return Si lo has introducido bien el numero que te devuelve
     */
    public static int mostrarMenuYLeerOpcion(Scanner sc, int min, int max) {
        int opcion = 0;
        do {
            try {
                mostrarMensaje(
                        "Que opcion quieres elegir:\n1.Añadir lote.\n2.Listar lotes\n3. Hacer puja (por índice).\n4.Ver ganador actual (por índice)\n5.Eliminar lote (por índice)\n0.Salir.");
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

    // Opcion1
    /**
     * Srive para agragar datos a un array
     * @param array
     * @param mensaje
     * @param sc
     */
    public static void agregarDatosArray(ArrayList<String> array,  String mensaje, Scanner sc) {
        String datoAgregar;
        mostrarMensaje(mensaje);
        datoAgregar = sc.nextLine();
        array.add(datoAgregar);
    }
    // Esta funcion solo deja introducir numeros enteros a un array y no para de
    // preguntar
    // hasta que introduces un numero valido.Si es un numero muy muy grande no lo
    // coge
    public static int validarPotencia( Scanner sc, String mensaje) {
        int numero = 0;
        boolean valido = false;
        do {
            try {
                mostrarMensaje(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                if (numero > 0) {
                    valido = true;
                } else {
                    mostrarMensaje("Introduce un numero valido");
                }
            } catch (NumberFormatException e) {
                mostrarMensaje("Introduce un numero");
            }
        } while (!valido);
        return numero;
    }

    // Opcion2
    /**
     * Muestra un listado en orden de cada array, con su respectivo elemento de otro
     * array
     * 
     * @param arrayNombres
     * @param arrayPotenciaVehiculo
     * @param arrayTrabajoRealizar
     * @param caracterSeparador     Caracter con el que quieras que se separen
     */
    public static void mostrarListado(ArrayList<String> arrayNombres, ArrayList<Integer> arrayPrecioInicial,
            ArrayList<Integer> arrayPuja, ArrayList<String> arrayMejorPostor, String caracterSeparador) {
        String mensaje = "";
        int contador = 0;
        // Hacer control de errores
        if (arrayNombres.size() == 0) {
            mostrarMensaje("Error no hay nada en el array");
        } else {
            for (int i = 0; i < arrayNombres.size(); i++) {
                mensaje += contador + "->" + arrayNombres.get(i) + caracterSeparador + " Precio inicial: "
                        + arrayPrecioInicial.get(i) + caracterSeparador + " Mejor puja: " + arrayPuja.get(i)
                        + caracterSeparador + " Mejor postor: " + arrayMejorPostor.get(i) + "\n";
                contador++;
            }
            mensaje = mensaje.substring(0, mensaje.length() - caracterSeparador.length());
            mostrarMensaje(mensaje);

        }
    }

    // Opcion3
    /**
     * Sirve para verificar que el numero introducido es una posicion existente en
     * el array
     * 
     * @param array Array donde verificar
     * @param sc
     * @return devuelve la posicion
     */
    public static int verificarNumeroEnArray(ArrayList<String> array, Scanner sc, String mensaje) {
        int numero = -1;
        if (array.size() != 0) {
            do {
                try {
                    mostrarMensaje(mensaje);
                    numero = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    mostrarMensaje("Introduce un numero");
                    numero = -1;
                }
            } while (numero < 0 || numero >= array.size());
        }
        return numero;
    }
    /**
     * Sirve para verificar que el numero introducido cumple con los requisitos establecidos(el numero introducido es mas grande que el precioInicial 
     * y es mas grande que la puja actual)
     * @param precioInicial Array donde se encuentra el precio inicial
     * @param arraMejorPuja Array donde se encuentra la mejor puja hasta ahora
     * @param puja Puja que vas a hacer
     * @param posicionArray posicion en la que se encuentra el producto a validar el precio
     * @return booleano
     */
    public static boolean verificarPuja(ArrayList<Integer> precioInicial, ArrayList<Integer>arraMejorPuja, int puja, int posicionArray) {
        boolean valido = false;
        if (puja >= precioInicial.get(posicionArray)) {
            if (puja > arraMejorPuja.get(posicionArray)) {
                valido = true;
                
            }else{
                mostrarMensaje("La puja que has puesto es menor a la mejor puja que habia");
            }
        }else{
            mostrarMensaje("La puja que has puesto es menor al precio inicial");
        }
        return valido;
    }

    //Opcion4
    /**
     * Muestra un listado en orden de cada array, con su respectivo elemento de otro array
     * @param arrayNombres
     * @param arrayPotenciaVehiculo
     * @param arrayTrabajoRealizar
     * @param caracterSeparador Caracter con el que quieras que se separen 
     */
    public static void mostrarListadoPorIdice(ArrayList<String> arrayMejorPostor,  ArrayList<Integer> arrayMejorPuja, int numero) {
        
        int mejorPuja = arrayMejorPuja.get(numero);
        //Hacer control de errores
        if (arrayMejorPostor.size() == 0) {
            mostrarMensaje("Error no hay nada en el array");
        } else {
            if (mejorPuja == 0) {
                mostrarMensaje("Todavia no hay puja");
            }else{
                mostrarMensaje("El mejor postor es " + arrayMejorPostor.get(numero) + " con la cantidad de: " + arrayMejorPuja.get(numero));
            }
            
            
        }
    }

    //Opcion5
    /**
     * Sirve para eliminar elementos de una posicion concreta en un array
     * @param arrayModelo
     * @param arrayPrecioInicial
     * @param arrayMejorPuja
     * @param arrayMejorPostor
     * @param numero posicion que quieres borrar
     */
    public static void eliminarElementos(ArrayList<String> arrayModelo, ArrayList<Integer> arrayPrecioInicial, ArrayList<Integer> arrayMejorPuja, ArrayList<String> arrayMejorPostor, int numero) {
        arrayModelo.remove(numero);
        arrayPrecioInicial.remove(numero);
        arrayMejorPuja.remove(numero);
        arrayMejorPostor.remove(numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> modelo = new ArrayList<>(Arrays.asList("John Deere 8R", "Lanz Bulldog", "Remolque 10t"));
        ArrayList<Integer> precioInicial = new ArrayList<>(Arrays.asList(250000, 15000, 8000));
        ArrayList<Integer> mejorPuja = new ArrayList<>(Arrays.asList(285000, 15000, 9200));
        ArrayList<String> mejorPostor = new ArrayList<>(Arrays.asList("AgroSánchez S.L.", "Sin pujas", "Luis García"));

        int opcion = 0;
        int numeroAEvaluar, pujaActual, introducirPrecioInicial, introducirMejorPuja;
        String personaAPujar;


        do {
            
            opcion = mostrarMenuYLeerOpcion(scanner, 0, 5);
            if (opcion == 1) {
                //Agrego una marca
                agregarDatosArray(modelo, "Dime la marca que quieres agregar: ", scanner);
                //Valido que el numero no sea negativo
                introducirPrecioInicial = validarPotencia( scanner, "Introduce el precio inicial: ");
                introducirMejorPuja = validarPotencia( scanner, "Introduce la mejor puja: ");
                precioInicial.add(introducirPrecioInicial);
                mejorPuja.add(introducirMejorPuja);
                //Agrego nombre mejor postor
                agregarDatosArray(mejorPostor, "Agrega el nombre del mejor postor: ", scanner);
                
            } else if (opcion == 2) {
                mostrarListado(modelo, precioInicial, mejorPuja, mejorPostor, "|");
            } else if (opcion == 3) {
                //Verifico que la posicion existe en el array
                numeroAEvaluar = -1;
                numeroAEvaluar = verificarNumeroEnArray(modelo, scanner, "Dime el numero del producto que quieres pujar: ");
                if (numeroAEvaluar != -1) {
                    System.out.println("Dime el nombre con el que vas a apostar: ");
                    personaAPujar = scanner.nextLine();
                    //Valido que la puja sea un numero positivo
                    pujaActual = validarPotencia( scanner, "Introduce la cantidad a pujar:");
                    //Si devuelve false no se acepta la puja
                    if (!verificarPuja(precioInicial, mejorPuja, pujaActual, numeroAEvaluar)) {
                        System.out.println("No se acepta la puja");
                    }else{
                        mejorPuja.set(numeroAEvaluar, pujaActual);
                        mejorPostor.set(numeroAEvaluar, personaAPujar);
                        System.out.println("Datos actualizados");
                    }
                } else {
                    System.out.println("No hay pujas para evaluar");
                }
            }else if (opcion == 4) {
                //Verifico que la posicion existe en el array
                numeroAEvaluar = -1;
                numeroAEvaluar = verificarNumeroEnArray(modelo, scanner, "Dime el numero del producto que quieres saber: ");
                if (numeroAEvaluar != -1) {
                    //muestro el listado de la posicion
                    mostrarListadoPorIdice(mejorPostor, mejorPuja, numeroAEvaluar);
                } else {
                    System.out.println("No hay pujas para evaluar");
                }
            }else if (opcion == 5) {
                numeroAEvaluar = -1;
                numeroAEvaluar = verificarNumeroEnArray(modelo, scanner, "Dime el numero del producto que quieres eliminar: ");
                if (numeroAEvaluar != -1) {
                    eliminarElementos(modelo, precioInicial, mejorPuja, mejorPostor, numeroAEvaluar);
                } else {
                    System.out.println("No hay pujas para eliminar");
                }
            }
        } while (opcion != 0);
        scanner.close();
    }
}
