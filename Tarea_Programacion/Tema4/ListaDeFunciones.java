package Tarea_Programacion.Tema4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDeFunciones {

    // ============== MOSTRAR MENU =================

    public static int mostrarMenuYLeerOpcion(Scanner sc) {
        int opcion = 0;
        boolean valido = false;

        do {
            imprimirMensaje(
                    "----- MENÚ -----\n" +
                            "1. Añadir elemento\n" +
                            "2. Eliminar elemento\n" +
                            "3. Mostrar lista\n" +
                            "4. Salir\n" +
                            "Elige una opción:");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion >= 1 && opcion <= 4) {
                    valido = true;
                } else {
                    imprimirMensaje("Opción incorrecta, debe ser entre 1 y 4.");
                }
            } else {
                imprimirMensaje("Error: debes introducir un número.");
                sc.nextLine();
            }

        } while (!valido);

        return opcion;
    }

    // ============= COMPROBAR STRING PARA VER SI ESTA DUPLICADO EN EL ARRAY O NO Y AÑADIRLO AL ARRAY
    // ====================

    public static boolean aniadirSinDuplicados(String posibleDuplicado, ArrayList<String> array) {
        boolean duplicadosEncontrado = false;

        for (int i = 0; i < array.size() && !duplicadosEncontrado; i++) {
            if (array.get(i).equalsIgnoreCase(posibleDuplicado)) {
                duplicadosEncontrado = true;
            }
        }
        if (!duplicadosEncontrado) {
            array.add(posibleDuplicado);

        } else {
            imprimirMensaje("\nNo se añade " + posibleDuplicado + " ya que está en el array");
        }

        return duplicadosEncontrado;
    }

    //=================== VERIFICAR QUE UN NUMERO NO ESTA EN EL ARRAY=============//
    /**
     * 
     * @param numero numero a verificar
     * @param array array donde verificar el numero
     * @return 
     */
    public static boolean verificarNumeroEnArray(int numero, ArrayList<Integer>array) {
        boolean duplicado = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == numero) {
                duplicado = true;
            }
        }
        if (!duplicado) {
            imprimirMensaje("El numero no se encuentra en el array");
        } else {
            imprimirMensaje("El numero se encuentra en el array");
        }
        return duplicado;
    }

    // ==================== LEER STRING QUE NO ESTE VACIO ======================

    public static String leerStringNoVacio(String mensaje, Scanner sc) {
        String texto;

        do {
            imprimirMensaje(mensaje);
            texto = sc.nextLine();

            if (texto.isEmpty()) {
                imprimirMensaje("Por favor introduzca texto y no lo dejes vacio");
            }

        } while (texto.isEmpty());

        return texto;
    }

    // ============= LEER STRING DE ARRAY EVITANDO DUPLICADOS (ENTRADA USUARIO)
    // ====================

    public static void leerStringArrayEvitandoDuplicados(String mensajeString, ArrayList<String> array, Scanner sc) {
        String stringUsuario;
        do {
            imprimirMensaje(mensajeString);
            stringUsuario = sc.nextLine();
        } while (aniadirSinDuplicados(stringUsuario, array));
    }

    // ============= LEER STRING DE ARRAY (ENTRADA USUARIO) ====================

    public static void leerStringArray(String mensajeString, ArrayList<String> array, Scanner sc) {
        imprimirMensaje(mensajeString);
        array.add(sc.nextLine());
    }

    // ============= IMPRIMIR MENSAJE ====================

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    // ============= ELIMINAR STRING DE ARRAY ====================

    public static boolean eliminarString(String texto, ArrayList<String> array) {
        boolean eliminado = false;

        for (int i = 0; i < array.size() && !eliminado; i++) {
            if (array.get(i).equalsIgnoreCase(texto)) {
                array.remove(i);
                eliminado = true;
            }
        }

        return eliminado;
    }

    // ============= MOSTRAR ARRAY POR PANTALLA (CUALQUIER TIPO)
    // ====================

    public static void mostrarArray(ArrayList<?> array, String caracterSeparador) {
        String mensaje = "";
        for (int i = 0; i < array.size(); i++) {
            mensaje += array.get(i) + caracterSeparador;
        }
        mensaje = mensaje.substring(0, mensaje.length() - caracterSeparador.length());
        imprimirMensaje(mensaje);
    }

    // ============== OBTENER EL STRING MAS LARGO DEL ARRAY ==================

    public static String obtenerStringMasLargo(ArrayList<String> array) {
        String masLargo = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i).length() > masLargo.length()) {
                masLargo = array.get(i);
            }
        }

        return masLargo;
    }

    // ============== OBTENER EL STRING MAS CORTO DEL ARRAY ==================

    public static String obtenerStringMasCorto(ArrayList<String> array) {
        String masCorto = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i).length() < masCorto.length()) {
                masCorto = array.get(i);
            }
        }

        return masCorto;
    }

    // ============= SUMAR TODOS LOS INT DE UN ARRAYLIST ====================

    public static int sumarArrayInt(ArrayList<Integer> array) {
        int suma = 0;

        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }

        return suma;
    }

    // ============= MEDIA ARRAY DE INT ====================

    public static double mediaArrayInt(ArrayList<Integer> array) {
        double media = 0;

        if (array.size() > 0) {
            media = (double) sumarArrayInt(array) / array.size();
        }

        return media;
    }

    // ============= OBTENER NUMERO MAYOR EN ARRAY ====================

    public static int obtenerMayor(ArrayList<Integer> array) {
        int mayor = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) > mayor) {
                mayor = array.get(i);
            }
        }

        return mayor;
    }

    // ============= OBTENER NUMERO MENOR EN ARRAY ====================

    public static int obtenerMenor(ArrayList<Integer> array) {
        int menor = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < menor) {
                menor = array.get(i);
            }
        }

        return menor;
    }

    // ============FILTRAR NUMEROS MAYORES DE UN ARRAY PASANDOLE UN VALOR
    // =====================

    public static ArrayList<Integer> filtrarNumerosMayores(ArrayList<Integer> array, int valor) {
        ArrayList<Integer> numerosMayores = new ArrayList<Integer>();

        for (int numero : array) {
            if (numero > valor) {
                numerosMayores.add(numero);
            }
        }
        return numerosMayores;
    }

    // =============== CONTAR SOLO LOS NUMEROS PARES =====================

    public static int contarPares(ArrayList<Integer> array) {
        int contador = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    // =========== CONTAR SOLO NUMEROS IMPARES =================

    public static int contarImpares(ArrayList<Integer> array) {
        int contador = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                contador++;
            }
        }

        return contador;
    }

    // ============== RELLENAR ARRAY CON NUM ALEATORIOS ===============00

    public static void rellenarArrayAleatorio(ArrayList<Integer> array, int cantidad, int min, int max) {
        array.clear();
        int numero;

        for (int i = 0; i < cantidad; i++) {
            numero = (int) (Math.random() * (max - min + 1)) + min;
            array.add(numero);
        }
    }

    // ============= RELLENAR ARRAY CON NUM ALEATORIOS QUE NO SEAN REPETIDOS ========================//

    /**
     * 
     * @param array Array donde se guardan los valores
     * @param cantidad Cantidad de numeros que se guardaran en el array
     * @param valorMinimo numero minimo que aparecera
     * @param valorMaximo numero maximo que aparecera
     */
    public static void rellenarArrayAleatorio1(ArrayList<Integer>array, int cantidad, int valorMinimo, int valorMaximo) {
        array.clear();
        int numeroAletorio;
        //Comparar los valores introducidos.
        if (valorMinimo > valorMaximo) {
            imprimirMensaje("El valor minimo es mas grande que el maximo");
        }
        //Si la cantidad de numeros a introducir en el array es mayor al valor maximo - minimo incluyendo ambos.
        if (cantidad > (valorMaximo - valorMinimo) + 1) {
            imprimirMensaje("La cantidad de numeros que quieres introducir en el array es demasiado grande.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                numeroAletorio = (int) (Math.random() * (valorMaximo - valorMinimo + 1)) + valorMinimo;
                //Comprobar que el numero no ha sido introducido
                while (array.contains(numeroAletorio)) {
                    numeroAletorio = (int) (Math.random() * (valorMaximo - valorMinimo + 1)) + valorMinimo;
                }
                array.add(numeroAletorio);
            }
        }
    }

    // ============================================MAIN==============================================================//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String separador = " - ";
        String mensajeAmostrar = "dime un color: ";

        ArrayList<String> libros = new ArrayList<>(
                Arrays.asList("El quijote", "La Biblia", "Manual de resistencia", "La criada"));

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ArrayList<Boolean> verdaderoFalso = new ArrayList<>(Arrays.asList(true, false, true, true, false));

        System.out.println("ARRAY DE STRING:\n");
        mostrarArray(libros, separador);

        System.out.println("\nARRAY DE INT: \n");
        mostrarArray(numeros, separador);

        System.out.println("\nARRAY DE BOOLEANO: \n");
        mostrarArray(verdaderoFalso, separador);

        int opcionSeleccionada = mostrarMenuYLeerOpcion(scanner);

        leerStringNoVacio(mensajeAmostrar, scanner);

        ArrayList<Integer> numerosAleatorios = new ArrayList<>();

        rellenarArrayAleatorio(numerosAleatorios, 10, 1, 50);
        mostrarArray(numerosAleatorios, " - ");
    }
}
