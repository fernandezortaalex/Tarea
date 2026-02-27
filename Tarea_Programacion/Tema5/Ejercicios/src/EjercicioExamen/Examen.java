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
        while (contadorAnimales <= numeroAnimalesAniadir) {
            Animal animal = new Animal(Faker.nombreAnimal(), Faker.cantidadAnimal(), Faker.precioAnimal());
            contadorAnimales+=animal.getCantidad();
            ArrayAnimalesAniadir.add(animal);
            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Creo el primer animal
        // Animal animal1 = new Animal("Perrp", 24, 34543);
        // Animal animal2 = new Animal("Perrp", 24, 34543);
        final int NUMEROANIMALES = 1000;
        ArrayList<Animal> animalesEnZoo = new ArrayList<>();
        aniadirAnimales(NUMEROANIMALES, animalesEnZoo);


        //Creo un array de animales donde van a ir todos los animales
        // animales.add(animal1);
        // animales.add(animal2);

        //Creo el nuevo zoologico y le paso el array con todos los animales introducidos
        Zoologico zoologico1 = new Zoologico(animalesEnZoo);

        int opcion = 0;
        int posicionAnimales = 0;
        do {
            opcion = mostrarMenuYLeerOpcion(scanner, 1, 6, "Que opcion quieres elegir:\n1. Mostrar todos los animales.\n2. Buscar un animal por código\n3. Agregar ejemplares a un animal.\n4. Retirar ejemplares de un animal. \n5. Eliminar un animal\n6.Salir.");
            if (opcion == 1) {
                mostrarMensaje(zoologico1.mostrarAnimales());
            }else if (opcion == 2) {
                /**
                 * LLamo al metodo {posicionAnimales} y le paso el codigo del animal, si es -1 imprime error
                 * en caso contrario imprime el animal de la posicion devuelta
                 */
                posicionAnimales = zoologico1.posicionAnimal(leerStringNoVacio("Codigo del animal a buscar", scanner));
                if (posicionAnimales != -1) {
                    mostrarMensaje("El animal es " + animalesEnZoo.get(posicionAnimales));
                }else{
                    mostrarMensaje("Animal no encontrado");
                }
            }else if (opcion == 3) {
                
            }
        } while (opcion != 6);
        scanner.close();
    }
}

