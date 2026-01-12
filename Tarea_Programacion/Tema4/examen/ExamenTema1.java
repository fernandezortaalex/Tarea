package Tarea_Programacion.Tema4.examen;

import java.util.Scanner;

public class ExamenTema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaro variables
        int numeroPedidos;
        int stockArroz;
        int stockAgua;
        int consumeStockArroz;
        Double consumeStockAgua;
        int precio;
        int contadorPedidos = 1;
        String tipoPlato;
        

        System.out.println("Numero de pedidos: ");
        numeroPedidos = scanner.nextInt();

        System.out.println("Stock Arroz: ");
        stockArroz = scanner.nextInt();

        System.out.println("Stock Agua: ");
        stockAgua = scanner.nextInt();

        //Empieza programa
        System.out.println("--- Pedido " + contadorPedidos + " ---");

        System.out.println("Tipo de plato: " );
        scanner.nextLine();
        tipoPlato = scanner.nextLine();

        if (tipoPlato.equalsIgnoreCase("maki")) {
            consumeStockArroz = 120;
            consumeStockAgua = 0.1;
            precio = 8;
        }else if (tipoPlato.equalsIgnoreCase("nigiri")) {
            consumeStockArroz = 50;
            consumeStockAgua = 0.05;
            precio = 10;
        }else if (tipoPlato.equalsIgnoreCase("sashimi")) {
            consumeStockArroz = 0;
            consumeStockAgua = 0.02;
            precio = 12;
        }
    }
}
