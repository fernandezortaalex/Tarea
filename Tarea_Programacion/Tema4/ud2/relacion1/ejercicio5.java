// Usando el array animales del ejercicio anterior, elimina el primer elemento.
// Muestra el array después de la eliminación y el valor del elemento eliminado.
package Tarea_Programacion.Tema4.ud2.relacion1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> animales = new ArrayList<>(Arrays.asList("perro", "gato"));
        String eliminado;

        animales.add("loro");
        animales.add("tortuga");

        eliminado = animales.remove(0);
        System.out.println(eliminado);
        scanner.close();
    }
}
