package Ejercicios.src.Relacion3.EjercicioMaestro;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;

public class Puerto {

    private static int numeroPuertos;

    private String nombre;
    public String ubicacion;
    private int capacidadMaxima;
    public String telefonoContacto;
    private ArrayList<Amarre> amarres;
    private ArrayList<Embarcacion> embarcaciones;
    private ArrayList<String> matriculasAmarradas;

    public Puerto(String ubicacion, int capacidadMaxima, String telefonoContacto,
            ArrayList<Amarre> amarres, ArrayList<Embarcacion> embarcaciones, ArrayList<String> matriculasAmarradas) {

        asignarNombre();
        this.ubicacion = ubicacion;
        this.telefonoContacto = telefonoContacto;
        setAmarres(amarres);
        setCapacidadMaxima(capacidadMaxima);
        setEmbarcaciones(embarcaciones);
        setMatriculasAmarradas(matriculasAmarradas);
    }

    public Puerto(String ubicacion, int capacidadMaxima, String telefonoContacto) {
        this(ubicacion, capacidadMaxima, telefonoContacto, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public Puerto(String ubicacion, int capacidadMaxima, String telefonoContacto, ArrayList<Amarre> amarres) {
        this(ubicacion, capacidadMaxima, telefonoContacto, amarres, new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (amarres != null) {
            if (amarres.size() <= capacidadMaxima) {
                this.capacidadMaxima = capacidadMaxima;
            }
        }
    }

    public ArrayList<Amarre> getAmarres() {
        return amarres;
    }

    public void setAmarres(ArrayList<Amarre> amarres) {
        if (amarres.size() <= capacidadMaxima) {
            this.amarres = amarres;

            for (int i = 0; i < amarres.size(); i++) {
                matriculasAmarradas.set(i, "VACIO");
            }
        }
    }

    public ArrayList<Embarcacion> getEmbarcaciones() {
        return embarcaciones;
    }

    public void setEmbarcaciones(ArrayList<Embarcacion> embarcaciones) {
        this.embarcaciones = embarcaciones;
    }

    public ArrayList<String> getMatriculasAmarradas() {
        return matriculasAmarradas;
    }

    public void setMatriculasAmarradas(ArrayList<String> matriculasAmarradas) {
        this.matriculasAmarradas = matriculasAmarradas;
    }

    public void asignarNombre() {
        setNombre("Puerto-" + numeroPuertos);
        numeroPuertos++;
    }

    // Registra embarcacion y devuelve tue si la encuentra false en caso contrario
    public boolean registrarEmbarcacion(Embarcacion e) {
        boolean embarcacionRegistrada = false;

        if (!embarcaciones.contains(e)) {
            embarcaciones.add(e);
            embarcacionRegistrada = true;
        }

        return embarcacionRegistrada;
    }

    // Registra embarcacion y devuelve tue si la encuentra false en caso contrario
    public boolean altaAmarre(Amarre a) {
        boolean amarreRegistrado = false;

        if (!amarres.contains(a) && amarres.size() < capacidadMaxima) {
            amarres.add(a);
            matriculasAmarradas.add("VACIO");
            amarreRegistrado = true;
        }

        return amarreRegistrado;
    }

    // Devuelve la embarcacion si la encuentra o null si no
    public Embarcacion buscarEmbarcacionEnPuerto(String matricula) {
        Embarcacion embarcacionBuscar = null;

        for (Embarcacion embarcacion : embarcaciones) {
            if (matricula.equals(embarcacion.getMatricula())) {
                embarcacionBuscar = embarcacion;
            }
        }
        return embarcacionBuscar;

    }

    // Devuelve un array de Booleanos para gestionar si el barco ha sido amarrado o,
    // en caso de que no, el motivo

    // [0]->Si está amarrado o no
    // [1]->En caso de no estar amarrado, si ha sido porque ya está en una plaza
    // amarrado
    // [2]-> // // // // //, si ha sido porque el amarre ya está ocupado por otra
    // embarcacion
    // [3]-> // // // // //, si ha sido porque el barco no cabe en el amarre
    public ArrayList<Boolean> asignarAmarre(String matricula, int numeroAmarre) {
        ArrayList<Boolean> controlErrores = new ArrayList<>(Arrays.asList(false, false, false, false));
        Amarre amarreAsignar = amarres.get(numeroAmarre);
        Embarcacion embarcacionAsignar = buscarEmbarcacionEnPuerto(matricula);
        if (!matriculasAmarradas.contains(embarcacionAsignar.getMatricula())) {
            controlErrores.set(1, true);  
            if (!amarreAsignar.isOcupado()) {
                controlErrores.set(2, true);
                if (embarcacionAsignar.getEslora() <= amarreAsignar.getLongitudMaxima()) {
                    matriculasAmarradas.set(numeroAmarre, matricula);
                    controlErrores.set(3, true);
                    controlErrores.set(0, true);
                }
            }
        }
        return controlErrores;
    }

    @Override
    public String toString() {
        return "Puerto [ubicacion=" + ubicacion + ", telefonoContacto=" + telefonoContacto + ", getNombre()="
                + getNombre() + ", getCapacidadMaxima()=" + getCapacidadMaxima() + ", getAmarres()=" + getAmarres()
                + ", getEmbarcaciones()=" + getEmbarcaciones() + ", getClass()=" + getClass() + "]";
    }

}
