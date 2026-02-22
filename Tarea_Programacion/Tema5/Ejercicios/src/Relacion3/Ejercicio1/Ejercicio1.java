package Ejercicios.src.Relacion3.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String matricula;
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Opcion");
            opcion = input.nextInt();
            input.nextLine();
            if (opcion == 1) {
                System.out.println("Matricula:");
                matricula = input.nextLine();
                
                Embarcacion barco1 = new Embarcacion(matricula, "Alex", 0, null, null, 0, 0);
                do {
                    System.out.println("Matricula:");
                    matricula = input.nextLine();
                    
                } while (barco1.setMatricula(matricula) != true);
                System.out.println(barco1);
            }
        }
        // if (barco1.setMatricula(null) == false) {
        //     System.out.println("Tus mekgs");
        // }
        // do {
            
        // } while (barco1.setMatricula(null) == false);
        // System.out.println(barco1);
    }
}
