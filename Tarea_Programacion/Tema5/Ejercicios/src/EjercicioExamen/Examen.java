package Ejercicios.src.EjercicioExamen;


import java.util.ArrayList;
import java.util.Scanner;

public class Examen {
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

    public static void mostrarMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    /**
     * Metodo para añadir animales aleatorios, le pasamos el numero de animales que queremos y el array a añadirlo
     * mientras que el numero de animales sea menor o igual al numero de animales a añadir va creando animales
     * @param numeroAnimalesAniadir Numero maximo de animales a crear
     * @param ArrayAnimalesAniadir Array donde se van a añadir los animales creados
     */
    public static void aniadirAnimales(int numeroAnimalesAniadir, ArrayList<Animal>ArrayAnimalesAniadir){
        int contadorAnimales = 0;
        String nombreAnimales;
        int cantidadAnimales;
        double precioAnimales;
        while (contadorAnimales < numeroAnimalesAniadir) {
            nombreAnimales = Faker.nombreAnimal();
            precioAnimales = Faker.precioAnimal();
            do {
                cantidadAnimales = Faker.cantidadAnimal();
            } while (cantidadAnimales == 0);

            if (contadorAnimales + cantidadAnimales > numeroAnimalesAniadir) {
                cantidadAnimales = numeroAnimalesAniadir - contadorAnimales;
            }
            contadorAnimales+=cantidadAnimales;
            Animal animal = new Animal(nombreAnimales, cantidadAnimales, precioAnimales);  
            ArrayAnimalesAniadir.add(animal);
            
        }
    }

    public static int validarQueSeaNumero(Scanner sc, String mensaje) {
        int numero = 0;
        boolean valido = false;
        do {
            try {
                mostrarMensaje(mensaje);
                numero = Integer.parseInt(sc.nextLine());
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUMEROANIMALES = 1000;
        ArrayList<Animal> animalesEnZoo = new ArrayList<>();
        aniadirAnimales(NUMEROANIMALES, animalesEnZoo);

        Zoologico zoologico1 = new Zoologico(animalesEnZoo);

        int opcion = 0;
        boolean booleanoAnimales;
        String codigoAnimal;
        int cantidadAnimales;
        
        do {
            opcion = mostrarMenuYLeerOpcion(scanner, 1, 6, "Que opcion quieres elegir:\n1. Mostrar todos los animales.\n2. Buscar un animal por código\n3. Agregar ejemplares a un animal.\n4. Retirar ejemplares de un animal. \n5. Eliminar un animal\n6.Salir.");
            if (opcion == 1) {
                mostrarMensaje(zoologico1.mostrarAnimales());
            }else if (opcion == 2) {
                /**
                 * Guardo el resultado del detodo buscarAnimalCodigo y si devulve null sale un mensaje de error
                 * si no devuelve al animal
                 */
                Animal encontrado = zoologico1.buscarAnimalCodigo(leerStringNoVacio("Codigo del animal a buscar", scanner));
                if (encontrado != null) {
                    mostrarMensaje(encontrado.toString());
                }else{
                    mostrarMensaje("Animal no encontrado");
                }
                
            }else if (opcion == 3) {
                /**
                 * Llamo a la funcion {@link Examen#leerStringNoVacio}
                 */
                codigoAnimal = leerStringNoVacio("Codigo del animal a añadir ejemplares", scanner);
                /**
                 * Llamo a la funcion {@link Examen#validarQueSeaNumero}
                 */
                cantidadAnimales = validarQueSeaNumero(scanner, "Cantidad de animales a añadir");
                /**
                 * Llamo a la funcion {@link zoologico1#agregarEjemplares}
                 */
                booleanoAnimales = zoologico1.agregarEjemplares(codigoAnimal, cantidadAnimales);
                /**
                 * Segun el resultado del metodo imprimo un mensaje
                 */
                if (!booleanoAnimales) {
                    mostrarMensaje("No se ha podido añadir los animales");
                }else{
                    mostrarMensaje("Se han añadido los animales");
                }
            }else if (opcion == 4) {
                /**
                 * Llamo a la funcion {@link Examen#leerStringNoVacio}
                 */
                codigoAnimal = leerStringNoVacio("Codigo del animal a retirar ejemplares", scanner);
                /**
                 * Llamo a la funcion {@link Examen#validarQueSeaNumero}
                 */
                cantidadAnimales = validarQueSeaNumero(scanner, "Cantidad de animales a retirar");
                /**
                 * Creo un arrayList para control de errores llamando a {@link zoologico1#retirarEjemplares}
                 */
                ArrayList<Boolean> retirarAnimalesZoo = zoologico1.retirarEjemplares(codigoAnimal, cantidadAnimales);
                if (retirarAnimalesZoo.get(0)) {
                    mostrarMensaje("Animales retirados con exito");
                }else if (!retirarAnimalesZoo.get(1)) {
                    mostrarMensaje("Animal no encontrado.");
                }else if (!retirarAnimalesZoo.get(2)) {
                    mostrarMensaje("No se puede retirar más ejemplares de los disponibles.");
                }
            }else if (opcion == 5) {
                /**
                 * Llamo a la funcion {@link Examen#leerStringNoVacio}
                 */
                codigoAnimal = leerStringNoVacio("Codigo del animal a eliminar", scanner);
                /**
                 * Creo un arrayList para control de errores llamando a {@link zoologico1#eliminarAnimal}
                 */
                ArrayList<Boolean> retirarAnimalesZoo = zoologico1.eliminarAnimal(codigoAnimal);
                if (retirarAnimalesZoo.get(0)) {
                    mostrarMensaje("Animal eliminado con exito");
                }else if (!retirarAnimalesZoo.get(1)) {
                    mostrarMensaje("Animal no encontrado.");
                }else if (!retirarAnimalesZoo.get(2)) {
                    mostrarMensaje("No se puede eliminar un animal con ejemplares disponibles.");
                }
            }
        } while (opcion != 6);
        scanner.close();
    }
}

