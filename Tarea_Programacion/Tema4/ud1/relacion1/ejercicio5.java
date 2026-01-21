package Tarea_Programacion.Tema4.ud1.relacion1;
import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        //Constante
        final double GRAVEDADLUNA = 0.165;
        //Por el momento esto se pone automatico
        Scanner scanner1 = new Scanner(System.in);
        //Declaro las variables
        double peso = 0;
        double pesoLuna = 0;

        System.out.println("Introduzca su peso: ");
        peso = scanner1.nextDouble();

        pesoLuna = (peso * GRAVEDADLUNA);
        //%.2f es para indicarle que solo queremos dos decimales del numero que nos de, si ponemos mas de uno
        //hay que ponerlo en orden
        System.out.printf("Tu peso en la luna seria: %.2f" , pesoLuna);
        
        scanner1.close();
    }
}
