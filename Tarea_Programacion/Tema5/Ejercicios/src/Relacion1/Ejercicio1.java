// Crea una clase Círculo con el atributo radio. Agrega un método calcularArea() que retorne el área del círculo (π * radio²) 
// y otro método calcularPerimetro() que retorne su perímetro (2 * π * radio).
package Ejercicios.src.Relacion1;

class circulo{
    final double PI = 3.14;
    double radio;
    
    circulo(double radio){
        this.radio = radio;
    }
    
    double calcularArea(){
        return PI * radio * radio;
    }

    double calcularPerimetro(){
        return 2 * PI * radio;
    }
    
    
}

public class Ejercicio1 {
    public static void main(String[] args) {
        circulo circulo1 = new circulo(20.0);
        circulo circulo2 = new circulo(2.3);

        System.out.println("Circulo de radio " + circulo1.radio + " Area: " + circulo1.calcularArea() + " Perimetro: " + circulo1.calcularPerimetro());
        System.out.println("Circulo de radio " + circulo2.radio + " Area: " + circulo2.calcularArea() + " Perimetro: " + circulo2.calcularPerimetro());
    }
}
