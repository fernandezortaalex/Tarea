package Tarea_Programacion.Tema4.examen;

import java.util.Scanner;

public class ExamenTema1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declaro variables
        int numeroPedidos;
        int stockArroz;
        double stockAgua;
        int consumeStockArroz = 0;
        Double consumeStockAgua = 0.0;
        int precioProduco = 0;
        int contadorPedidos = 1;
        String tipoPlato;
        int unidades;
        int precioTotal = 0;
        int contadorArroz = 0;
        double contadorAgua = 0.0;
        int stockArrozAcumulado = 0;
        double stockAguaAcumulado = 0.0;

        System.out.println("Numero de pedidos: ");
        numeroPedidos = scanner.nextInt();

        System.out.println("Stock Arroz: ");
        stockArroz = scanner.nextInt();

        System.out.println("Stock Agua: ");
        stockAgua = scanner.nextInt();

        for (int i = 0; i < numeroPedidos; i++) {
            //Empieza programa
            System.out.println("--- Pedido " + contadorPedidos + " ---");
            
            System.out.println("Tipo de plato: " );
            scanner.nextLine();
            tipoPlato = scanner.nextLine();
            
            System.out.println("Numero de unidades: ");
            unidades = scanner.nextInt();
            
            for (int j = 0; j < unidades; j++) {
                if (tipoPlato.equalsIgnoreCase("maki")) {
                    consumeStockArroz = 120;
                    consumeStockAgua = 0.1;
                    precioProduco = 8;
                }else if (tipoPlato.equalsIgnoreCase("nigiri")) {
                    consumeStockArroz = 50;
                    consumeStockAgua = 0.05;
                    precioProduco = 10;
                }else if (tipoPlato.equalsIgnoreCase("sashimi")) {
                    consumeStockArroz = 0;
                    consumeStockAgua = 0.02;
                    precioProduco = 12;
                }
                
                stockArroz -= consumeStockArroz;
                stockAgua -= consumeStockAgua;
                precioTotal += precioProduco;
                
                contadorArroz += consumeStockArroz;
                contadorAgua += consumeStockAgua;
                
                stockArrozAcumulado += consumeStockArroz;
                stockAguaAcumulado += consumeStockAgua;
            }
            
            System.out.println("Plato: " + tipoPlato + " | Unidades: " + unidades + " | Importe cobrado: " + precioProduco );
            System.out.println("Arroz gastado: " + contadorArroz + " | Acumulado: " + stockArrozAcumulado);
            System.out.println("Agua gastado: " + contadorAgua + " | Acumulado: " + stockAguaAcumulado);
            
            contadorPedidos++;
            contadorArroz = 0;
            contadorAgua = 0;
        }

        //Parte final
        System.out.println("----------------------------------------");
        System.out.println("Pedidos registrados: " + (contadorPedidos - 1) + " de " + numeroPedidos);
        System.out.println("Consumo total | Arroz: " + stockArrozAcumulado + " | Agua " + stockAguaAcumulado);
        System.out.println("Stock restante Arroz: " + stockArroz + " Agua: " + stockAgua);
        System.out.println("Caja del dia: " + precioTotal);
        System.out.println("Registro completado con exito");

    }
}
