package EjerciciosT6.src.Relacion1.Ejercicio2;

class Gerente extends Empleado {

    private final double BONIFICADOR = 5;

    public Gerente(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }
    
    double calcularSueldo(){
        double sueldoCalculado = BONIFICADOR * sueldoBase;
        return sueldoCalculado;
    }

    @Override
    public String toString() {
        return "Gerente [nombre=" + nombre + ", BONIFICADOR=" + calcularSueldo() + "]";
    }

}
