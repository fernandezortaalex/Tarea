package Ejercicios.src.Relacion3.Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;

public class Amarre {

    
    private static int numeroAmarres;
    /**
     * Creo un array con los tipos de barcos validos
     */
    private final static ArrayList<String> TIPOSVALIDOS = new ArrayList<>(
            Arrays.asList("NORMAL", "PREMIUM", "MEGAYATE"));

    private int numero;
    private double longitudMaxima;
    // Cambio de visibilidad a privado al tener restricciones
    private double precioDia;
    private boolean ocupado;
    // Cambio de visibilidad a privado al tener restricciones
    private String tipoAmarre;

    /**
     * Constructor
     * @param longitudMaxima
     * @param tipoAmarre
     */
    public Amarre( double longitudMaxima, String tipoAmarre) {
        asignarAmarre();
        this.ocupado = false;
        setTipoAmarre(tipoAmarre);
        setLongitudMaxima(longitudMaxima);
        calcularPrecioDia();
    }

//Numero
    private void asignarAmarre(){
        numero = numeroAmarres;
        numeroAmarres++;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

//Longitud Maxima
    private void imprimirMensajeError(String mensajeError) {
        System.err.println(mensajeError);
    }
    public double getLongitudMaxima() {
        if (longitudMaxima == -1) {
            imprimirMensajeError("Longitud máxima con valor erroneo al ser menor de 4.0M. Solucionelo por favor");
        }
        return longitudMaxima;
    }
    /**
     * Si la longitud maxima es mayor igual a 4 se guarda el dato y se calcula su precio
     * @param longitudMaxima
     */
    public void setLongitudMaxima(double longitudMaxima) {
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
            calcularPrecioDia();
        } else {
            // Añado valor por defecto si falla el setLongitudMaxima a -1
            // para cumplir las restricciones ya que 0 no seria valor valido
            this.longitudMaxima = -1;
            precioDia = -1;
        }
    }

//Precio Dia
    /**
     * Si el precio es -1 que muestre un mensaje de error (Se convierte en -1 en {@link Amarre#setLongitudMaxima})
     * @return
     */
    public double getPrecioDia() {
        if (precioDia == -1) {
            imprimirMensajeError("Longitud máxima con valor erroneo al ser menor de 4.0M. Solucionelo por favor");
        }
        return precioDia;
    }
    /**
     * Calcula el precio segun el tipo de amarre y su longitud maxima
     */
    private void calcularPrecioDia() {
        if (tipoAmarre.equals(TIPOSVALIDOS.get(0))) {
            precioDia = 25 + (1.5 * longitudMaxima);
        } else if (tipoAmarre.equals(TIPOSVALIDOS.get(1))) {
            precioDia = 60 + (2.2 * longitudMaxima);
        } else {
            precioDia = 120 + (3.5 * longitudMaxima);
        }
    }

//Ocupado
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

//Tipo amarre
    public String getTipoAmarre() {
        return tipoAmarre;
    }
    /**
     * Si el tipo de amarre esta dentro de los datos del array se da valor a tipo de amarre y se calcula el precio del dia
     * @param tipoAmarre
     */
    public void setTipoAmarre(String tipoAmarre) {
        if (TIPOSVALIDOS.contains(tipoAmarre.toUpperCase())) {
            this.tipoAmarre = tipoAmarre;
            calcularPrecioDia();
        }
    }

    /**
     * Mostrar mensaje segun el dato que le llegue de {@link Amarre#ocupado}
     * @return
     */
    public String consultarDisponibilidad(){
        return ocupado ? "Etá ocupado" : "Está libre";
    }

    @Override
    public String toString() {
        return "Amarre " + numero + " del tipo " + tipoAmarre + ". Longitud maxima de "
                + getLongitudMaxima() + "m con precio diario de "+ getPrecioDia() + "€/dia." + consultarDisponibilidad() ;
    }

    

}