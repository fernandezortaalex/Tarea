package Tarea_Programacion.Tema5.Relacion2;
class Estudiante {
    private String nombre;
    private int edad;
    private String numeroMatricula;

    public Estudiante(String nombre, int edad, String numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre(){
        return nombre;
    }
    
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Alex", 21, "4354353B");
        
    }
}
