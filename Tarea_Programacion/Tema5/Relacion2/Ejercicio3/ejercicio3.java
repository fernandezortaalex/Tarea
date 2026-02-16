package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        Producto champuHS = new Producto("Champú HS",
                "Olor a limón",
                3.49,
                100);

        if (!champuHS.setPrecio(-8.01)) {
            System.err.println("Ha habido un error actualizando el precio");
        }
        if (!champuHS.setPrecio(8)) {
            System.err.println("Ha habido un error actualizando el precio");
        }

        System.out.println(champuHS.getPrecio());

        if (!champuHS.setCantidadEnStock(-8)) {
            System.err.println("Ha habido un error actualizando la cantidad");
        }

        if (!champuHS.setCantidadEnStock(50)) {
            System.err.println("Ha habido un error actualizando la cantidad");
        }

        System.out.println(champuHS.getCantidadEnStock());

        //Supermercado
        
    }

}