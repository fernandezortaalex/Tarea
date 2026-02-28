package Ejercicios.src.EjercicioExamen;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoologico {
    private ArrayList<Animal> animales;

    /**
     * Constructor
     * 
     * @param animales
     */
    public Zoologico(ArrayList<Animal> animales) {
        setAnimales(animales);
    }

    /**
     * Devuelvo el animal
     * 
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
     * 
     * @param separador Elemento que hace de separador
     * @return Devuelve un string de informacion del animal
     */
    public String mostrarAnimales() {
        String mensaje = "";
        for (Animal animal : animales) {
            mensaje += animal;
        }
        return mensaje;
    }

    /**
     * Le paso un codigo y va recorriendo el array de animales hasta que el codigo
     * introducido
     * coincida con un codigo de los animales. Si coincide devuelve el animal
     * si no le devuelve un numero negativo.
     * @param codigo
     * @return
     */
    public Animal buscarAnimalCodigo(String codigo){
        boolean encontrado = false;
        Animal animalEncontrado = null;
        for (int i = 0; i < animales.size() && encontrado != true; i++) {
            if (animales.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                animalEncontrado = animales.get(i);
                encontrado = true;
            }
        }
        return animalEncontrado;
    }

    /**
     * Corregirlo para llamar a la funcion {@link Zoologico#posicionAnimal(String)}
     * y con el numero que te devuelva añadir la cantidad que le indiques
     * 
     * @param codigo
     * @param cantidadAniadir
     */
    public boolean agregarEjemplares(String codigo, int cantidadAniadir) {
        boolean encontrado = false;
        Animal animal = buscarAnimalCodigo(codigo);
        if (animal != null) {
            animal.setCantidad(animal.getCantidad() + cantidadAniadir) ;
            encontrado = true;
        }
        return encontrado;
    }

    /**
     * Voy haciendo if else con cada condicion, por defecto el arrayList de booleanosesta en negativo
     * si una condicion no se cumple su posicion se queda en false, asi cuando vaya al main 
     * si esa posicion esta en false es ahi donde esta el error.
     * 1= animal no existe
     * 2= retirar mas cantidad de la que hay de animales
     * @param codigo
     * @param cantidadRetirar
     * @return
     */
    public ArrayList<Boolean> retirarEjemplares(String codigo, int cantidadRetirar){
        ArrayList<Boolean> controlErrores = new ArrayList<>(Arrays.asList(false, false, false));
        Animal animal = buscarAnimalCodigo(codigo);
        if (animal != null) {
            controlErrores.set(1, true);
            if (animal.getCantidad() >= cantidadRetirar) {
                controlErrores.set(2, true);
                controlErrores.set(0, true);
                animal.setCantidad(animal.getCantidad() - cantidadRetirar) ;
                
            }
        }
        return controlErrores;
    }

    /**
     * 1= animal no existe
     * 2= retirar animal con cantidad mayor a 0
     * @param codigo
     * @return
     */
    public ArrayList<Boolean> eliminarAnimal(String codigo){
        ArrayList<Boolean> controlErrores = new ArrayList<>(Arrays.asList(false, false, false));
        Animal animal = buscarAnimalCodigo(codigo);
        if (animal != null) {
            controlErrores.set(1, true);
            if (animal.getCantidad() == 0) {
                controlErrores.set(2, true);
                controlErrores.set(0, true);
                animales.remove(animal);
            }
        }
        return controlErrores;
    }



}
