package src.Relacion1.Ejercicio15;

public class Gerente extends Empleado {
    private double bono;
    
    public Gerente(double sueldoBase, String nombre, double bono) {
        super(nombre, sueldoBase);
        this.bono = bono;
    }
    
    
    
    public double getBono() {
        return bono;
    }
    
    
    public void setBono(double bono) {
        this.bono = bono;
    }
    
    @Override
    double calcularSueldo() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
