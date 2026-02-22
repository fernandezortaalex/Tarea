package Ejercicios.src.Relacion3.Ejercicio1;

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
        this.eslora = eslora;
        this.tipo = tipo;
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
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
        if (matricula != null && matricula.length() != 0) {
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
        this.tipo = tipo;
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
        if (anioFabricacion >= 1950 || anioFabricacion <= 2026) {
            this.anioFabricacion = anioFabricacion;
        }
    }
    
    
    @Override
    public String toString() {
        String mensaje;
        mensaje = "numero de matricula: " + matricula + nombre + eslora + tipo + propietario + anioFabricacion + valorEstimado;
        if (matricula == null) {
            mensaje = "Debes poner una matricula valida";
        }
        return mensaje;
    }






    
}
