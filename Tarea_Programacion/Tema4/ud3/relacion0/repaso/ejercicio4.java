
package Tarea_Programacion.Tema4.ud3.relacion0.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    /**
     * Para introducir un menu
     * 
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
     * Pide un String para añadir en un array hasta que no este duplicado o no este vacio
     * @param array Array donde guardar la informacion
     * @param mensaje mensaje a mostrar
     * @param sc
     */
    public static void aniadirSinDuplicados( ArrayList<String> array, String mensaje, Scanner sc) {
        boolean duplicadosEncontrado = false;
        String nombreAniadir;
        do {
            duplicadosEncontrado = false;
            mostrarMensaje(mensaje);
            nombreAniadir = sc.nextLine();
            for (int i = 0; i < array.size() && !duplicadosEncontrado; i++) {
                if (array.get(i).equalsIgnoreCase(nombreAniadir)) {
                    duplicadosEncontrado = true;
                }
            }
            if (!duplicadosEncontrado) {
                array.add(nombreAniadir);
            }else if (nombreAniadir.isEmpty()) {
                mostrarMensaje("Debes introducir algo");
            }else {
                mostrarMensaje("\nNo se añade " + nombreAniadir + " ya que está en el array");
            }
        } while (duplicadosEncontrado || nombreAniadir.isEmpty());
    }
    
    /**
     * Esta funcion solo deja introducir numeros enteros a un array y no para de preguntar
     * hasta que introduces un numero valido.Si es un numero muy muy grande no lo coge
     * @param array Array donde añadir el numero
     * @param sc 
     */
    public static void validarPotencia(ArrayList<Integer>array, Scanner sc, String mensaje) {
        int numero;
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
    }

    //Opcion 2
    /**
     * Comprueba que el string no tenga ningun numero
     * @param mensaje Introduce la palabra 
     * @return devuelve true si no tiene ningun numero
     */
    public static boolean comprobarString(String mensaje) {
        
        char letra;
        boolean noTieneNumero = true;
        //Recorro el string
        for (int i = 0; i < mensaje.length(); i++) {
            //Cogo la letra
            letra = mensaje.charAt(i);
            //Si la letra es un numero
            if (Character.isDigit(letra)) {
                noTieneNumero = false;
            }
        }
        return noTieneNumero;
    }

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
            mostrarMensaje(mensaje);
        }
    }

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
                    mostrarMensaje("Dime el numero de la empresa que quieres estar: ");
                    numero = Integer.parseInt(sc.nextLine());
                    
                    
                } catch (NumberFormatException e) {
                    mostrarMensaje("Introduce un numero");
                    numero = -1;
                }
                
            } while (numero < 0 || numero >= array.size());
        } 
        return numero;
    }

    //Opcion 5
    /**
     * Muestra los elementos que son mayores a un numero
     * @param arrayNombres Array a sacar informacion
     * @param arrayEdad Array a comparar con el valor minimo
     * @param caracterSeparador
     */
    public static void mostrarMayoresEdad(ArrayList<String> arrayNombres, ArrayList<Integer> arrayEdad, String caracterSeparador, int minimo) {
        int contador = 0;
        if (arrayNombres.isEmpty() || arrayEdad.isEmpty()) {
            mostrarMensaje("No hay elementos en el array");
        }else{
            for (int i = 0; i < arrayEdad.size(); i++) {
                if (arrayEdad.get(i) >= minimo) {
                    mostrarMensaje(arrayNombres.get(i) + caracterSeparador + arrayEdad.get(i));
                    contador++;
                }
            }
            if (contador == 0) {
                mostrarMensaje("No hay ninguna persona que sea mayor de edad");
            }
        }
    }

    //Opcion 6
    /**
     * Sirve para verificar que un elemento este en un array
     * @param arrayNombresEmpresas Array donde se muestra la informacion a guardar si se encuentra
     * @param arraySectoresEmpresas Array para comprobar si el sato introducido coincide con el parametro a introducir
     * @param buscar parametro a buscar 
     * @param mensaje Mensaje a introcuir si hay coincidencia
     */
    public static void comprobarStringArray(ArrayList<String>arrayNombresEmpresas,ArrayList<String>arraySectoresEmpresas, String buscar, String mensaje) {
        ArrayList<String> nombresEmpresas = new ArrayList<>();
        if (arrayNombresEmpresas.isEmpty() || arrayNombresEmpresas.isEmpty()) {
            mostrarMensaje("No hay elementos en el array");
        }else{
            for (int i = 0; i < arraySectoresEmpresas.size(); i++) {
                if (arraySectoresEmpresas.get(i).equalsIgnoreCase(buscar)) {
                    nombresEmpresas.add(arrayNombresEmpresas.get(i));
                } 
            }
            if (nombresEmpresas.isEmpty()) {
                mostrarMensaje("Ningun elemento coincide");
            }else{
                for (String nombre : nombresEmpresas) {
                    mostrarMensaje(mensaje + nombre);
                }
            }
            
        }
    }

    //Opcion 7
    /**
     * Para obtener la posicion en el array del numero mayor
     * @param array
     * @return devuelve la posicion
     */
    public static int obtenerPosicionMayor(ArrayList<Integer> array) {
        int mayor = array.get(0);
        int posicionMayor = 0;
            for (int i = 1; i < array.size(); i++) {
                if (array.get(i) > mayor) {
                    mayor = array.get(i);
                    posicionMayor = i;
                }
            }
        

        return posicionMayor;
    }

    //Opcion 8
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
         * Arrays empresas
         */
        ArrayList<String> nombresEmpresas = new ArrayList<>(Arrays.asList("TechNova", "BioSalud", "EducaPlus", "RetailLink"));
        ArrayList<String> sectoresEmpresas = new ArrayList<>(Arrays.asList("salud", "salud", "educacion", "salud"));
        ArrayList<Integer> vacantesDisponibles = new ArrayList<>(Arrays.asList(6, 7, 3, 5));
        /**
         * Arrays Candidatos
         */
        ArrayList<String> nombresCandidatos = new ArrayList<>(Arrays.asList("Lucía García", "Marcos Soler", "Elena Sanz", "Javier López"));
        ArrayList<Integer> edadesCandidatos = new ArrayList<>(Arrays.asList(44,55,22,44));
        ArrayList<String> perfilesProfesionales = new ArrayList<>(Arrays.asList("programador", "marketing", "diseñador", "programador"));
        ArrayList<String> inscripcionEmpresa = new ArrayList<>(Arrays.asList("TechNova", "RetailLink", "TechNova", "TechNova"));

        int opcion = 0;
        //Opcion2
        String introducirProfesion;
        int posicionEmpresas = -1;
        //Opcion 6
        String sectorEmpresaBuscar;
        //Opcion7
        int numeroMayoresVacantes;

        do {
        opcion = mostrarMenuYLeerOpcion(scanner, 0, 8, "Que opcion quieres elegir:\n1.Añadir empresa.\n2.Añadir candidato\n3.Listar todas las empresas.\n4.Listar todos los candidatos.\n5.Mostrar candidatos mayores de edad.\n6.Buscar empresas por sector.\n7.Mostrar la empresa con más vacantes.\n8.Mostrar cuántos candidatos tiene cada empresa\n0.Salir.");

        if (opcion == 1) {
            //Mientras que este en el array pide que ingreses el nombre
            aniadirSinDuplicados(nombresEmpresas, "Dime el nombre de la empresa a añadir: ", scanner);
            aniadirSinDuplicados(sectoresEmpresas, "Dime el nombre del sector de la empresa a añadir: ", scanner);
            //Añado el numero de vacantes
            validarPotencia(vacantesDisponibles, scanner, "Cuantas vacantes libres va a tener esta empresa: ");
        }else if (opcion == 2) {
            aniadirSinDuplicados(nombresCandidatos, "Dime el nombre del candidato a introducir: ", scanner);
            validarPotencia(edadesCandidatos, scanner, "Dime su edad: ");
            //Compruebo que no tenga numero el perfil a introducir
            do {
                mostrarMensaje("Dime su profesion: ");
                introducirProfesion = scanner.nextLine();
                
            } while (!comprobarString(introducirProfesion));
            perfilesProfesionales.add(introducirProfesion);
            //INSCRIBIR EMPRESA
            //Muestro las empresas que existen
            mostrarArray(nombresEmpresas, "|");
            //Pido el numero de la empresa que quieren incribirse
            posicionEmpresas = verificarNumeroEnArray(nombresEmpresas, scanner);
            //Si la encuentra la agrega
            if (posicionEmpresas != -1) {
                inscripcionEmpresa.add(nombresEmpresas.get(posicionEmpresas));
            }else{
                mostrarMensaje("No hay ninguna empresa");
            }
            
        }else if (opcion == 3) {
            mostrarArray(nombresEmpresas, " | ");
        }else if (opcion == 4) {
            mostrarArray(nombresCandidatos, " | ");
        }else if (opcion == 5) {
            mostrarMayoresEdad(nombresCandidatos, edadesCandidatos, " -> ", 18);
        }else if (opcion == 6) {
            do {
                System.out.println("Introduce el sector al que quieres que pertenezca la empresa: ");
                sectorEmpresaBuscar = scanner.nextLine();
            } while (sectorEmpresaBuscar.isEmpty());
            comprobarStringArray(nombresEmpresas, sectoresEmpresas, sectorEmpresaBuscar, "Las empresas con esas bacantes son: ");
        }else if (opcion == 7) {
            if (vacantesDisponibles.isEmpty()) {
                mostrarMensaje("Error el array esta vacio");
            }else{
                numeroMayoresVacantes = obtenerPosicionMayor(vacantesDisponibles);
                mostrarMensaje("La empresa con mas vacantes es: " + nombresEmpresas.get(numeroMayoresVacantes));
            }
        }else if (opcion == 8) {
            contarCandidatos(nombresEmpresas, inscripcionEmpresa);
        }
        } while (opcion >= 0);
    }
}
