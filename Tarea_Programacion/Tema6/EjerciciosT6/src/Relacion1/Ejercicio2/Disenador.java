package src.Relacion1.Ejercicio2;

class Disenador extends Empleado {

    private final double BONIFICADOR = 2;

    public Disenador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }
    
    double calcularSueldo(){
        double sueldoCalculado = BONIFICADOR * sueldoBase;
        return sueldoCalculado;
    }

    @Override
    public String toString() {
        return "Disenador [nombre=" + nombre + ", BONIFICADOR=" + calcularSueldo() + "]";
    }
}
    
