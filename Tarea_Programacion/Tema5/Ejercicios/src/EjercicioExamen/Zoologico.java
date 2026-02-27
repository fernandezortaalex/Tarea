package Ejercicios.src.EjercicioExamen;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animales;

    /**
     * Constructor
     * @param animales
     */
    public Zoologico(ArrayList<Animal> animales) {
        setAnimales(animales);
    }


    /**
     * Devuelvo el animal
     * @return
     */
    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        
        this.animales = animales;
        
    }
    
    /**
     * Muestra todos los animales que hay en el array de animales
     * @param separador Elemento que hace de separador
     * @return Devuelve un string de informacion del animal
     */
    public String mostrarAnimales(){
        String mensaje= "";
        for (Animal animal : animales) {
            mensaje += animal;
        }
        return mensaje;
    }

    /**
     * Le paso un codigo y va recorriendo el array de animales hasta que el codigo introducido
     * coincida con un codigo de los animales. Si coincide devuelve la posicion de i,
     * si no le devuelve un numero negativo. 
     * @param codigo Codigo del animal a buscar
     * @return posicion de ese animal
     */
    public int posicionAnimal(String codigo){
        boolean encontrado = false;
        int posicionAnimal = -1;
        for (int i = 0; i < animales.size() && encontrado != true; i++) {
            if (animales.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                posicionAnimal = i;
                encontrado = true;
            }
        }
        return posicionAnimal;
    }

    /**
     * Corregirlo para llamar a la funcion {@link Zoologico#posicionAnimal(String)}
     * y con el numero que te devuelva añadir la cantidad que le indiques
     * @param codigo
     * @param cantidadAniadir
     */
    public void agregarEjemplares(String codigo, int cantidadAniadir){
        boolean encontrado = false;
        for (int i = 0; i < animales.size() && encontrado != true; i++) {
            if (animales.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                animales.get(i).setCantidad(animales.get(i).getCantidad() + cantidadAniadir);
                encontrado = true;
            }
        }
        if (animalAMostrar.isEmpty()) {
            animalAMostrar = "Animal no encontrado.";
        }
    }

}
