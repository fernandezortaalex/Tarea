// Crea un array llamado frutas que contenga los elementos "manzana", "banana", "naranja".
// Elimina el primer elemento y añade "fresa" al final.
// Imprime el array resultante.
package Tarea_Programacion.Tema4.ud2.relacion1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("manzana", "banana", "naranja"));
        frutas.remove(0);
        frutas.add("fresa");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        scanner.close();
    }
}
