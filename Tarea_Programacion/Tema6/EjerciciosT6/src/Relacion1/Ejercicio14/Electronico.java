package src.Relacion1.Ejercicio14;

public class Electronico extends Producto {
    private Double garantia;

    

    public Electronico(String nombre, int precio, Double garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    public Double getGarantia() {
        return garantia;
    }

    public void setGarantia(Double garantia) {
        this.garantia = garantia;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return garantia + getNombre() + getPrecio();
    }
}
