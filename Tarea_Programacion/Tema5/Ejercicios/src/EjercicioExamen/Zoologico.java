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

    public void mostrarAnimalCodigo(String codigo){
        for (int i = 0; i < animales.size(); i++) {
            if (animales.getCo(i)) {
                
            }
        }
    }
}
