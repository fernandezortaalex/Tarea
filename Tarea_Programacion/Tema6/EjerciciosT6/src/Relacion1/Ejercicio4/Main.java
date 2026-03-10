package EjerciciosT6.src.Relacion1.Ejercicio4;
// ### 4. Animales Domésticos y Salvajes
// **Enunciado:**  
// Crea una clase `Animal` con los atributos `nombre` y `tipoAlimentacion`. 
// Luego, crea dos subclases: `Domestico` con el método `convivirConHumanos()` y
//  `Salvaje` con el método `cazar()`. 
// Cada método debe devolver una cadena con una acción específica relacionada con el tipo de animal.  

// - `Domestico`:
//     - Atributos: `dueño`
//     - Método `convivirConHumanos()`: devuelve "El animal doméstico [nombre] convive con su dueño [dueño] y se alimenta de [tipoAlimentacion]."

// - `Salvaje`:
//     - Atributos: `habitat`
//     - Método `cazar()`: devuelve "El animal salvaje [nombre] caza en su hábitat [habitat] y se alimenta de [tipoAlimentacion]."

// Implementa una clase `Main` para probar la creación de objetos y la llamada a los métodos `convivirConHumanos()` y `cazar()`.
public class Main {
    public static void main(String[] args) {
        Animales animal1 = new Animales("caballo", "pienso");
        Domestico domestico1 = new Domestico("perro", "pienso");
        Salvaje salvaje1 = new Salvaje("zorro", "carne");
        System.out.println(animal1);
        System.out.println(domestico1);
        System.out.println(salvaje1);
    }
}
