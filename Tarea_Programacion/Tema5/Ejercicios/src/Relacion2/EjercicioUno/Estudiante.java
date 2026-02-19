package Ejercicios.src.Relacion2.EjercicioUno;

public class Estudiante {
    private String nombre;
    private int edad;
    private String numeroMatricula;
    
    public Estudiante(String nombre, int edad, String numeroMatricula){
        setNombre(nombre);
        setEdad(edad);
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        String nombreMostrar = nombre;
        if (edad >= 18) {
            nombreMostrar = "El alumno es menor de edad, no se pueden mostrar sus datos";
        }
        return nombreMostrar;
    }

    /**
     * Añade el nombre si es mayor a 0
     * @param nombre
     */
    public void setNombre(String nombre) {
        
        if (nombre.length() > 0) {
            this.nombre = nombre;
            
        }
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
            
        }
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String toString() {
        String mensajeMostrar = "Estudiante: " + nombre + " con edad: " + edad + " numero matricula: " + numeroMatricula;
        if (edad < 18) {
            mensajeMostrar = "Debido a que es menor no puedo mostrarte sus datos";
        }
        return mensajeMostrar;
    }
}