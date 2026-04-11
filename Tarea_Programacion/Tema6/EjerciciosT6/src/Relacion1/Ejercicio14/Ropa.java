package src.Relacion1.Ejercicio14;

public class Ropa extends Producto {
    private String talla;

    public Ropa(String talla, String nombre, double precio) {
        this.talla = talla;
        super(nombre, precio);
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return talla + getNombre() + getPrecio();
    }
}
