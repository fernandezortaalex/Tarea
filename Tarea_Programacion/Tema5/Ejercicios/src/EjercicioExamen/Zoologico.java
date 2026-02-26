package Ejercicios.src.EjercicioExamen;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animales;

    public Zoologico(ArrayList<Animal> animales) {
        setAnimales(animales);
    }
    public Zoologico() {
        setAnimales(animales);
    }


    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        
        if (animales == null) {
            this.animales = new ArrayList<>();
        } else {
            this.animales = animales;
        }
    }
    
    /**
     * Muestra todos los animales que hay en el array de animales
     * @param separador Elemento que hace de separador
     * @return Devuelve un string de informacion del animal
     */
    public String mostrarAnimales(String separador){
        String mensaje= "";
        for (Animal animal : animales) {
            mensaje += "Codigo: " + animal.getCodigo() + separador + " Nombre: " + animal.getNombre() + separador + " Cantidad: " + animal.getCantidad() + separador + " Precio: " + animal.getPrecio() + "\n";
        }
        return mensaje;
    }

    public void mostrarAnimalCodigo(String codigo){
        for (int i = 0; i < animales.size(); i++) {
            
        }
    }
}
