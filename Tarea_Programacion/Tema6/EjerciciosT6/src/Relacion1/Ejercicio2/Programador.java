package EjerciciosT6.src.Relacion1.Ejercicio2;

class Programador extends Empleado {

    private final double BONIFICADOR = 1.5;

    public Programador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }
    
    double calcularSueldo(){
        double sueldoCalculado = BONIFICADOR * sueldoBase;
        return sueldoCalculado;
    }

    @Override
    public String toString() {
        return "Programador [nombre=" + nombre + ", BONIFICADOR=" + calcularSueldo() + "]";
    }

    
}
