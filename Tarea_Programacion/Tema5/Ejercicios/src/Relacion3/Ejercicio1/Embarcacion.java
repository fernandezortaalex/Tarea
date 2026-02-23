package Ejercicios.src.Relacion3.Ejercicio1;

import java.time.Year;

public class Embarcacion {
    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    /**
     * Creo el constructor
     * @param matricula
     * @param nombre
     * @param eslora
     * @param tipo
     * @param propietario
     * @param anioFabricacion
     * @param valorEstimado
     */
    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario, int anioFabricacion, double valorEstimado) {
        setMatricula(matricula);
        this.nombre = nombre;
        setEslora(eslora);
        setTipo(tipo);
        this.propietario = propietario;
        setAnioFabricacion(anioFabricacion);
        this.valorEstimado = valorEstimado;
    }

    /**
     * Matricula
     */
    public String getMatricula(){
        return matricula;
    }
    public boolean setMatricula(String matricula){
        boolean aplicado = false;
        if (matricula != null && !matricula.isBlank()) {
            this.matricula = matricula;
            aplicado = true;
        }
        return aplicado;
    }

    /**
     * nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * eslora
     */
    public double getEslora() {
        return eslora;
    }
    public void setEslora(double eslora){
        if (eslora > 0) {
            this.eslora = eslora;
        }
    }

    /**
     * Tipo
     */
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        if (tipo.toLowerCase() == "velero" || tipo.toLowerCase() == "yate" || tipo.toLowerCase() == "catamaran" || tipo.toLowerCase() == "moto de agua") {
            this.tipo = tipo.toLowerCase();
        }
    }
    
    /**
     * Propietario
     */
    public String getPropietario() {
        return propietario;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Año
     */
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion){        
        if (anioFabricacion >= 1950 || anioFabricacion <= Year.now().getValue()) {
            this.anioFabricacion = anioFabricacion;
        }
    }
    
    
    @Override
    public String toString() {
        String mensaje;
        mensaje = "Embarcacion: " + 
                    "\n Matricula:" + matricula +
                    "\n Nombre: " + nombre + 
                    "\n eslora: " + eslora + 
                    "\n tipo: " + tipo + 
                    "\n propietario: " + propietario + 
                    "\n año fabricacion: " + anioFabricacion + 
                    "\n Valor estimado: " + valorEstimado;
        
        return mensaje;
    }

    
}
