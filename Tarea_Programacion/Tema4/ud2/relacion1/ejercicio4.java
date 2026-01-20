// Crea un array llamado animales que contenga los elementos "perro", "gato".
// Añade "loro" y "tortuga" al inicio del array y luego imprime el array.
package Tarea_Programacion.Tema4.ud2.relacion1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> animales = new ArrayList<>(Arrays.asList("perro", "gato"));

        
        animales.addFirst("loro");
        animales.addFirst("tortuga");
        animales.addFirst("pato");

        System.out.println(String.join(", ", animales));
        scanner.close();

    }
}
