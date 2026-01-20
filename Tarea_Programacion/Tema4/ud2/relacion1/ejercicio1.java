
// Crea un array llamado numeros que contenga los números [5, 10, 15, 20].
// Imprime en la consola el primer y el último elemento accediendo directamente por su índice.
package Tarea_Programacion.Tema4.ud2.relacion1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asi pongo directamente los datos en el array
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 10, 15, 20));

        System.out.println(numeros.get(0));
        System.out.println(numeros.get(numeros.size() - 1));
        scanner.close();



    }
}