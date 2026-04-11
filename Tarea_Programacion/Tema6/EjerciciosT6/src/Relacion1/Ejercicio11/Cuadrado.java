package src.Relacion1.Ejercicio11;

public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }



    @Override
    double calcularArea() {
        return lado * lado;
    }
}
