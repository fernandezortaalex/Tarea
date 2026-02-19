package Ejercicios.src.Relacion2.EjercicioDos;

import java.util.ArrayList;

public class Biblioteca {

    /**
     * Creo la clase <Libro> para almacenar libros de la biblioteca, de momento vacio
     */
    ArrayList<Libro> coleccion;

    /**
     * Inicializo la coleccion con una lista vacia
     */
    public Biblioteca (){
        coleccion = new ArrayList<>();
    }

    // /**
    //  * Creo constructor
    //  * @param coleccion
    //  */
    // public Biblioteca(ArrayList<Libro> coleccion) {
    //     this.coleccion = coleccion;
    // }

    /**
     * Agrego elementos a coleccion
     * @param libro
     */
    public void agregarLibro(Libro libro){
        coleccion.add(libro);
    }

    /**
     * LLamamos al array Libro que contenga una clase libro 
     * Si esta disponible se cambia a false
     * @param libro Objeto de la clase Libro, se puede llamar como quiera
     */
    public void prestarLibro(Libro libro){
        if (libro.getDisponible()) {
            libro.setDisponible(false);
        }
    }

    public void devolverLibro(Libro libro){
        if (!libro.getDisponible()) {
            libro.setDisponible(true);
        }
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (Libro libro : coleccion) {
            mensaje += "|" + libro + "\n";
        }
        return mensaje;
    }
}
