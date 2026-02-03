// Crea una clase Alumno con atributos nombre, materia y calificacion. 
// Agrega un método aprobo() que devuelva True si la calificación es mayor o igual a 6, y False en caso contrario.
package Tarea_Programacion.Tema5.Relacion1;

class alumno {
    // Atributos
    String nombre;
    String materia;
    double calificacion;

    // Constructor
    alumno(String nombre, String materia, double calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    // Metodo para saber si ha aprobado
    boolean aprobo() {
        // boolean aprobado = false;
        // if (calificacion >= 6.0) {
        // aprobado = true;
        // }
        // return aprobado;

        //Compara lo que esta entre parentesis si es verdadero es true y si es falso es false
        // return (calificacion >= 6.0) ? true : false;

        //Esto tambien compara y te devuelve true o false
        return calificacion >= 6.0;
    }

}

public class Ejercicio3 {
    public static void main(String[] args) {
        // Defino los datos que va a tener alumno1
        alumno alumno1 = new alumno("Alex", "Mates", 6.0);
        alumno alumno2 = new alumno("Paco", "Ingles", 4.0);

        // Llamo al metodo con los datos ingresados como alumno1 y coge la calificacion
        // guardada de ese objeto
        System.out.println(alumno1.aprobo());
        System.out.println(alumno2.aprobo());
    }
}
