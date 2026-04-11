package src.Relacion1.Ejercicio2;
// Crea una clase Empleado con los atributos nombre y sueldoBase. 
// Luego, crea tres subclases: Programador, Diseñador y Gerente. 
// Cada subclase debe tener un método calcularSueldo() 
// que ajuste el sueldo base según un bonificador específico para cada tipo de empleado.
// private final double BONIFICADOR = 1.5

// Implementa una clase Main para probar la creación de objetos y la llamada al método calcularSueldo().

public class Main{
    public static void main(String[] args) {
    Empleado empleado1 = new Empleado("Alex", 1200.5);
    Programador programador1 = new Programador("pedro", 12);
    Disenador disenador1 = new Disenador("pedro", 12);
    Gerente gerente1 = new Gerente("pedro", 12);
    System.out.println(empleado1);
    System.out.println(programador1);
    System.out.println(disenador1);
    System.out.println(gerente1);
    }
}
