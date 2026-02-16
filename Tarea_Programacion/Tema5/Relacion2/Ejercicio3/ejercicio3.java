package Ejercicio3;

public class ejercicio3 {
    public static void main(String[] args) {
        Producto champuPantene = new Producto( "Champu Pantene", "olor a menta", 3.49, 100);
        Producto champuHys = new Producto("hys", "", 2.25, 20);

        if(!champuHys.setPrecio(-10)){
            System.out.println("uepa cabesa que no se pueden negativos");
        }

        System.out.println(champuHys + "\n");

        if(champuPantene.setPrecio(40)){
            System.out.println("Precio cambiado correctamente");
        }

        System.out.println(champuPantene);

        
    }
}
