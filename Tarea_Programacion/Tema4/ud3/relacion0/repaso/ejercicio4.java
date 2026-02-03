
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
     * Pide un String para añadir en un array hasta que no este duplicado
     * @param array Array donde guardar la informacion
     * @param mensaje mensaje a mostrar
     * @param sc
     */
    public static void aniadirSinDuplicados( ArrayList<String> array, String mensaje, Scanner sc) {
        boolean duplicadosEncontrado = false;
        String nombreAniadir;
        do {
            mostrarMensaje(mensaje);
            nombreAniadir = sc.nextLine();
            for (int i = 0; i < array.size() && !duplicadosEncontrado; i++) {
                if (array.get(i).equalsIgnoreCase(nombreAniadir)) {
                    duplicadosEncontrado = true;
                }
            }
            if (!duplicadosEncontrado) {
                array.add(nombreAniadir);
            } else {
                mostrarMensaje("\nNo se añade " + nombreAniadir + " ya que está en el array");
            }
        } while (duplicadosEncontrado);
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Arrays empresas
         */
        ArrayList<String> nombresEmpresas = new ArrayList<>(Arrays.asList("TechNova", "BioSalud", "EducaPlus", "RetailLink"));
        ArrayList<String> sectoresEmpresas = new ArrayList<>(Arrays.asList("tecnología", "salud", "educación", "comercio"));
        ArrayList<Integer> vacantesDisponibles = new ArrayList<>(Arrays.asList(3, 1, 5, 2));
        /**
         * Arrays Candidatos
         */
        ArrayList<String> nombresCandidatos = new ArrayList<>(Arrays.asList("Lucía García", "Marcos Soler", "Elena Sanz", "Javier López"));
        ArrayList<Integer> edadesCandidatos = new ArrayList<>(Arrays.asList(28, 34, 22, 40));
        ArrayList<String> perfilesProfesionales = new ArrayList<>(Arrays.asList("programador", "marketing", "diseñador", "programador"));
        ArrayList<String> inscripcionEmpresa = new ArrayList<>(Arrays.asList("TechNova", "RetailLink", "TechNova", "TechNova"));

        int opcion = 0;
        //Opcion2
        String introducirProfesion;
        

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
            
        }
    }
}
