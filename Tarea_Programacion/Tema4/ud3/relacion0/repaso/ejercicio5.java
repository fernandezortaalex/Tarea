package Tarea_Programacion.Tema4.ud3.relacion0.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
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

    //Opcion1
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

    //Opcion 2
    /**
     * Muestra todos los elementos de un array de forma enumerada
     * @param array
     * @param caracterSeparador
     */
    public static void mostrarArray(ArrayList<?> array, String caracterSeparador) {
        if (array.isEmpty()) {
            mostrarMensaje("No hay ningun elemento");
        }else{
            String mensaje = "";
            int contador = 0;
            for (int i = 0; i < array.size(); i++) {
                mensaje += contador + " -> " + array.get(i) + caracterSeparador;
                contador++;
            }
            mensaje = mensaje.substring(0, mensaje.length() - caracterSeparador.length());
            mostrarMensaje("Elige el puesto que quieras: " + mensaje);
        }
    }
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
                    mostrarMensaje("Dime el numero del empleo que quieres : ");
                    numero = Integer.parseInt(sc.nextLine());
                    
                    
                } catch (NumberFormatException e) {
                    mostrarMensaje("Introduce un numero");
                    numero = -1;
                }
                
            } while (numero < 0 || numero >= array.size());
        } 
        return numero;
    }
    

    //Opcion3
    /**
     * Muestra los elementos que son mayores a un numero
     * @param arrayNombres Array a sacar informacion
     * @param arraySalarios Array a comparar con el valor minimo
     * @param caracterSeparador
     */
    public static void mostrarSalariosDeseados(ArrayList<String> arrayNombres, ArrayList<Double> arraySalarios, String caracterSeparador, double minimo) {
        int contador = 0;
        if (arrayNombres.isEmpty() || arraySalarios.isEmpty()) {
            mostrarMensaje("No hay elementos en el array");
        }else{
            for (int i = 0; i < arraySalarios.size(); i++) {
                if (arraySalarios.get(i) >= minimo) {
                    mostrarMensaje(arrayNombres.get(i) + caracterSeparador + arraySalarios.get(i));
                    contador++;
                }
            }
            if (contador == 0) {
                mostrarMensaje("No hay ninguna persona que sea mayor de edad");
            }
        }
    }
    public static Double validarQueSeaNumero(Scanner sc, String mensaje) {
        Double numero = 0.0;
        boolean valido = false;
        do {
            try {
                mostrarMensaje(mensaje);
                numero = Double.parseDouble(sc.nextLine());
                if (numero > 0) {
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

    //Opcion4
    /**
     * Cuenta para cada elemento del arrayNombresEmpresas el numero de  arrayInscripcionEmpresas que coincida con ese elemento
     * @param arrayNombresEmpresas Array donde contar 
     * @param arrayInscripcionEmpresas Array donde se compara cada elemento con cada elemento del arrayNombresEmpresas 
     */
    public static void contarCandidatos(ArrayList<String>arrayNombresEmpresas, ArrayList<String>arrayInscripcionEmpresas) {
        int numeroInscripciones = 0;
        if (arrayNombresEmpresas.isEmpty()) {
            mostrarMensaje("No existen empresas");
        }else if (arrayInscripcionEmpresas.isEmpty()) {
            mostrarMensaje("No existen inscripciones");
        }else{
            for (int i = 0; i < arrayNombresEmpresas.size(); i++) {
                numeroInscripciones = 0;
                for (int j = 0; j < arrayInscripcionEmpresas.size(); j++) {
                    if (arrayNombresEmpresas.get(i).equalsIgnoreCase(arrayInscripcionEmpresas.get(j))) {
                        numeroInscripciones++;
                    }
                    
                }
                mostrarMensaje(arrayNombresEmpresas.get(i) + " tiene " + numeroInscripciones + " candidatos.");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Arrays de empleos
         */
        ArrayList<String> puestos = new ArrayList<>(Arrays.asList("Programador Java", "Diseñador UX", "Analista de Datos", "Soporte Técnico"));
        ArrayList<String> empresasOfertas = new ArrayList<>(Arrays.asList("TechNova", "CreativeMind", "DataStats", "FixIt Corp"));
        ArrayList<Double> salarios = new ArrayList<>(Arrays.asList(2500.0, 2100.5, 2800.0, 1800.75));
        /**
         * Arrays de asistencia
         */
        ArrayList<String> nombresAsistentes = new ArrayList<>(Arrays.asList("Iker", "Ruben", "Alex", "Elena"));
        ArrayList<String> puestosInteres = new ArrayList<>(Arrays.asList("Programador Java", "Analista de Datos", "Programador Java", "Diseñador UX"));
        int opcion = 0;
        //Opcion1
        double aniadirSalario;
        //Opcion2
        int numeroAEvaluar = 0;
        //Opcion3
        double cantidadMinimaCobrar;

        do {
            opcion = mostrarMenuYLeerOpcion(scanner, 0, 4, "Que opcion quieres elegir:\n1.Añadir ofertas de empleo.\n2.Registrar asistencia a una oferta\n3.Mostrar ofertas de trabajo superiores a una cantidad.\n4.Mostrar cuantas personas se han interesado por una oferta.\n0.Salir.");
            if (opcion == 1) {
                puestos.add(leerStringNoVacio("Dime el puesto a incluir: ", scanner));
                empresasOfertas.add(leerStringNoVacio("Dime la empresa a añadir: ", scanner));
                aniadirSalario = validarQueSeaNumero(scanner, "Dime el salario a introducir: ");
                salarios.add(aniadirSalario);
                System.out.println(puestos +""+ empresasOfertas + salarios);
            }else if (opcion == 2) {
                nombresAsistentes.add(leerStringNoVacio("Dime el nombre a añadir: ", scanner));
                mostrarArray(puestos, " | ");
                numeroAEvaluar = -1;
                numeroAEvaluar = verificarNumeroEnArray(puestos, scanner);
                if (numeroAEvaluar != -1) {
                    puestosInteres.add(puestos.get(numeroAEvaluar));
                } else {
                    mostrarMensaje("No exite ese puesto.");
                }
            }else if (opcion == 3) {
                cantidadMinimaCobrar = validarQueSeaNumero(scanner, "Dime la cantidad minima a cobrar: ");
                mostrarSalariosDeseados(puestos, salarios, " | ", cantidadMinimaCobrar);
            }else if (opcion == 4) {
                contarCandidatos(puestos, puestosInteres);
            }
        } while (opcion != 0);
        scanner.close();
    }
}


