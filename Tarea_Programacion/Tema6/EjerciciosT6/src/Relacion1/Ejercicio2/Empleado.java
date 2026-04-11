package src.Relacion1.Ejercicio2;

public class Empleado {
    public String nombre;
    public double sueldoBase;
    
    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
    }

    
}
