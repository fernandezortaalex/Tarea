package EjerciciosT6.src.Relacion1.Ejercicio1;

public class Electrodomestico {
    private String marca;
    private String modelo;

    public Electrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + "]";
    }
    
    
}
