package Ejercicios.src.Relacion3.Ejercicio1;

import java.util.ArrayList;

public class Puerto {
    private static int MAXIMO = 2;

    private String nombre;
    public String ubicacion;
    private int capacidadMaxima;
    public String telefonoContacto;
    private ArrayList<Amarre> amarres;
    private ArrayList<Embarcacion> embarcaciones;
    private ArrayList<String> matriculasAmarradas;
    

//Constructor
    public Puerto(String nombre, String ubicacion, int capacidadMaxima, String telefonoContacto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        setCapacidadMaxima(capacidadMaxima);;
        this.telefonoContacto = telefonoContacto;
        this.amarres = new ArrayList<>();
        this.embarcaciones = new ArrayList<>();
        this.matriculasAmarradas =  new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

//Capacidad maxima
    private void imprimirMensajeError(String mensajeError) {
        System.err.println(mensajeError);
    }
    private void imprimirMensaje(String mensajeError) {
        System.out.println(mensajeError);
    }
    public int getCapacidadMaxima() {
        if (capacidadMaxima == -1) {
            imprimirMensajeError("No puedes introducir esa capacidad, tiene que estar entre 0 y " + MAXIMO);
        }
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima > MAXIMO || capacidadMaxima < 0) {
            this.capacidadMaxima = -1;
        }else{
            this.capacidadMaxima = capacidadMaxima;
        }
    }

//Amarres
    public ArrayList<Amarre> getAmarres() {
        return amarres;
    }
    

    public ArrayList<Embarcacion> getEmbarcaciones() {
        return embarcaciones;
    }


    public ArrayList<String> getMatriculasAmarradas() {
        return matriculasAmarradas;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = "Embarcacion: " + 
                    "\n nombre:" + nombre +
                    "\n ubicacion: " + ubicacion + 
                    "\n capacidadMaxima: " + getCapacidadMaxima() + 
                    "\n telefonoContacto: " + telefonoContacto + 
                    "\n amarres: " + amarres + 
                    "\n embarcaciones: " + embarcaciones + 
                    "\n matriculasAmarradas: " + matriculasAmarradas;
        
        return mensaje;
    }

    public void registrarEmbarcacion(Embarcacion embacar){
        boolean matriculaDuplicada = false;
        for (int i = 0; i < embarcaciones.size() && !matriculaDuplicada; i++) {
            if (embarcaciones.get(i).getMatricula().equalsIgnoreCase(embacar.getMatricula()) ){
                imprimirMensajeError("La matricula no puede estar duplicada");
                matriculaDuplicada = true;
            }
        }
        if (!matriculaDuplicada) {
            embarcaciones.add(embacar);
            imprimirMensaje("Embarcacion añadida correctamente");
        }
    }

    public void altaAmarre(Amarre amarre){
        if (amarres.size() >= capacidadMaxima) {
            imprimirMensajeError("No puedes crear mas amarres");
        }else{
            boolean amarreDuplicado = false;
            for (int i = 0; i < amarres.size() && !amarreDuplicado; i++) {
                if (amarres.get(i).getNumero() == amarre.getNumero()) {
                    amarreDuplicado = true;
                    imprimirMensajeError("El numero del amarre no puede estar duplicada");
                }
            }
            if (!amarreDuplicado) {
                amarres.add(amarre);
                imprimirMensaje("Amarre añadido correctamente");
            }
        }
    }
    
}
