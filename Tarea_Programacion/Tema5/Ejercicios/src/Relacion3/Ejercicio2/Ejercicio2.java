package Ejercicios.src.Relacion3.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        Cliente cliente1 = new Cliente("Alex", "222222222", "353463465435", "svgdvfdfb@svs", "vrdbvdfv");
        Cliente cliente2 = new Cliente("Alex", "222223222", "353463465435", "svgdvfdfb@svs", "vrdbvdfv");
        // System.out.println(cliente1);

        Tramite tramite1 = new Tramite("Gestion de herencias", 4, 6);
        Tramite tramite2 = new Tramite("Gestion de herencias", 6, 2);
        // System.out.println(tramite1);

        Expediente expediente1 = new Expediente(cliente1, tramite1, null);
        // System.out.println(expediente1);

        Gestoria gestoria1 = new Gestoria("Gestoria Alex", "calle panama", "2423423", "22:30");

        /**
         * Comprobar que se pueden añadir clientes
         */
        gestoria1.altaCliente(cliente1);
        gestoria1.altaCliente(cliente2);
        for (Cliente cliente : gestoria1.getClientes()) {
            System.out.println(cliente);
        }
        
        /**
         * Comprobar que se pueden añadir los tramites
         */
        gestoria1.altaTramite(tramite1);
        gestoria1.altaTramite(tramite2);
        for (Tramite tramite : gestoria1.getTramites()) {
            System.out.println(tramite);
        }
        
        /**
         * Abrir un expediente nuevo
         */
        gestoria1.abrirExpediente(expediente1);
        for (Expediente expediente : gestoria1.getExpedientes()) {
            System.out.println(expediente);
        }
        
        /**
         * Muestro la gestoria entera
         */
        System.out.println(gestoria1);


        do {
            System.out.println("Dime la opcion");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                gestoria1.cambiarEstadoExpediente(expediente1);
                System.out.println(gestoria1.getExpedientes());
            }else if (opcion == 2) {
                
            }
        } while (opcion != 8);
    }
}
