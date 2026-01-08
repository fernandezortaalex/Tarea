package Tarea_Programacion.Tema4.relacion1;
import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduzca su peso: ");

        double peso = scanner1.nextDouble();
        System.out.println("peso: " + peso);
        
        double pesoLuna = (peso * 0.165);

        scanner1.close();
    }
}
