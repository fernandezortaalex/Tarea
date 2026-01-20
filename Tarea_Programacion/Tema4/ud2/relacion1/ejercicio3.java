// Usando el array colores del ejercicio anterior, elimina el último color.
// Muestra el array resultante y el valor del color eliminado.
package Tarea_Programacion.Tema4.ud2.relacion1;
import java.util.Scanner;
import java.util.ArrayList; 

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> colores = new ArrayList<>();
        String eliminar;

        //Introduzco los colores
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");

        eliminar = colores.remove(colores.size()-1);

        for (String color : colores) {
            System.out.println(color);
        }

        System.out.println("El color eliminado es " + eliminar);
        scanner.close();
    }
}
