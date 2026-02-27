package Ejercicios.src.Relacion3.EjercicioMaestro;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;

public class Embarcacion {

    private static int numeroEmbarcaciones;
    private final static ArrayList<String> TIPOSVALIDOS = new ArrayList<>(
            Arrays.asList("VELERO", "LANCHA", "YATE", "CATAMARAN", "MOTO DE AGUA"));

    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario,
            int anioFabricacion, double valorEstimado) {

        setMatricula(matricula);
        numeroEmbarcaciones++;

        this.nombre = nombre;
        setEslora(eslora);
        setTipo(tipo);
        this.propietario = propietario;
        setAnioFabricacion(anioFabricacion);
        this.valorEstimado = valorEstimado;
    }

    public Embarcacion(String nombre, double eslora, String tipo, String propietario,
            int anioFabricacion, double valorEstimado) {
        setMatricula();
        numeroEmbarcaciones++;

        this.nombre = nombre;
        setEslora(eslora);
        setTipo(tipo);
        this.propietario = propietario;
        setAnioFabricacion(anioFabricacion);
        this.valorEstimado = valorEstimado;
    }

    // EJEMPLO LLAMAR A CONSTRUCTOR DESDE OTRO CONSTRUCTOR
    public Embarcacion(String nombre, double eslora, String tipo) {
        this(nombre, eslora, tipo, "PROPIETARIOVACIO", 1998, 5000.0);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        // this.matricula = matricula != null && !matricula.isBlank() ? matricula :
        // null;
        if (matricula != null && !matricula.isBlank()) {
            this.matricula = matricula;
        }
    }

    public void setMatricula() {
        this.matricula = "EMB-" + numeroEmbarcaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        if (eslora > 0) {
            this.eslora = eslora;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (TIPOSVALIDOS.contains(tipo.toUpperCase())) {
            this.tipo = tipo;
        }
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        // Cambio en la resolucion para usar año actual en vez de 2026
        if (anioFabricacion >= 1950 && anioFabricacion <= Year.now().getValue()) {
            this.anioFabricacion = anioFabricacion;
        }
    }

    @Override
    public String toString() {
        return nombre + " - Matricula: " + matricula + " con " + eslora+ "m de eslora de " + propietario + ". Es una embarcacion tipo " + tipo + 
                 " de "  + anioFabricacion + " con un valor estimado de " + valorEstimado + "€.";
    }

}
