package Ejercicios.src.EjercicioExamen;


import java.util.ArrayList;
import java.util.Scanner;
/**
 * Funcion mostrar mensaje
 */
public class Examen {
    public static void mostrarMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion= 0;
        //Creo el primer animal
        Animal animal1 = new Animal("Perrp", 24, 34543);
        Animal animal2 = new Animal("Perrp", 24, 34543);

        //Creo un array de animales donde van a ir todos los animales
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(animal1);
        animales.add(animal2);

        //Creo el nuevo zoologico y le paso el array con todos los animales introducidos
        Zoologico zoologico1 = new Zoologico(animales);

        //Menu
        System.out.println("Dime la opcion a elegir: ");
        opcion = scanner.nextInt();
        if (opcion == 1) {
            mostrarMensaje(zoologico1.mostrarAnimales());
        }else if (opcion == 2) {
            
        }
    }
}
