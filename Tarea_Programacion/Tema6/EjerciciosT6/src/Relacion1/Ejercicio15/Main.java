package EjerciciosT6.src.Relacion1.Ejercicio15;

// ### 15. Empleados con Diferentes Roles
// **Enunciado:**  
// Crea una **clase abstracta** `Empleado` que tenga un método abstracto `calcularSueldo()`.
//  y atributos nombre y  sueldoBase;

//  Luego, crea dos clases concretas: `Gerente` y `Asistente`.
//  La clase `Gerente` debe tener un atributo adicional `bono` y su método `calcularSueldo()`
//  debe devolver el sueldo base más el bono. La clase `Asistente` debe tener un atributo adicional `horasExtras` 
// y su método `calcularSueldo()` debe devolver el sueldo base más el pago por horas extras.  

// Implementa una clase `Main` para probar la creación de objetos y la llamada al método `calcularSueldo()`.

public class Main {
    public static void main(String[] args) {
        Gerente santi = new Gerente(18000.0, "Santiago Abascal", 40000.0);
        Asistente olola = new Asistente(800, "Macarena Olona", 60000);

        System.out.println(santi);
        System.out.println(olola);

    }
}
