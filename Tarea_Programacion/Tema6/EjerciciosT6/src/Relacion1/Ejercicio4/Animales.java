package src.Relacion1.Ejercicio4;

public class Animales {
    protected String nombre;
    protected String tipoAlimentacion;
    
    public Animales(String nombre, String tipoAlimentacion) {
        this.nombre = nombre;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public String toString() {
        return "Animales [nombre=" + nombre + ", tipoAlimentacion=" + tipoAlimentacion + "]";
    }
    
}
