// Crea un array vacío llamado colores.
// Añade los colores "rojo", "verde" y "azul" al final del array y luego imprime el array.
package Tarea_Programacion.Tema4.ud2.relacion1;
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> colores = new ArrayList<>();

        //Introduzco los colores
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        System.out.println(String.join(",", colores));
        scanner.close();
    }
}
