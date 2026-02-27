package Ejercicios.src.Relacion3.EjercicioMaestro;

import java.util.ArrayList;
import java.util.Arrays;

public class Amarre {

    private static int numeroAmarres;
    private final static ArrayList<String> TIPOSVALIDOS = new ArrayList<>(
            Arrays.asList("NORMAL", "PREMIUM", "MEGAYATE"));

    private int numero;
    private double longitudMaxima;
    // Cambio de visibilidad a privado al tener restricciones
    private double precioDia;
    private boolean ocupado;
    // Cambio de visibilidad a privado al tener restricciones
    private String tipoAmarre;

    public Amarre(double longitudMaxima, String tipoAmarre) {
        asignarAmarre();
        this.ocupado = false;
        setTipoAmarre(tipoAmarre);
        setLongitudMaxima(longitudMaxima);
    }

    private void asignarAmarre() {
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

    private void imprimirMensajeError(String mensajeError) {
        System.err.println(mensajeError);
    }

    public double getLongitudMaxima() {
        if (longitudMaxima == -1) {
            imprimirMensajeError("Longitud máxima con valor erroneo al ser menor de 4.0M. Solucionelo por favor");
        }
        return longitudMaxima;
    }

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

    public double getPrecioDia() {
        if (precioDia == -1) {
            imprimirMensajeError("Longitud máxima con valor erroneo al ser menor de 4.0M. Solucionelo por favor");
        }
        return precioDia;
    }

    private void calcularPrecioDia() {
        if (tipoAmarre != null && longitudMaxima != 0.0) {

            if (tipoAmarre.equals(TIPOSVALIDOS.get(0))) {
                precioDia = 25 + (1.5 * longitudMaxima);
            } else if (tipoAmarre.equals(TIPOSVALIDOS.get(1))) {
                precioDia = 60 + (2.2 * longitudMaxima);
            } else {
                precioDia = 120 + (3.5 * longitudMaxima);
            }
        }
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void setTipoAmarre(String tipoAmarre) {
        if (TIPOSVALIDOS.contains(tipoAmarre.toUpperCase())) {
            this.tipoAmarre = tipoAmarre;
            calcularPrecioDia();
        }
    }

    public String consultarDisponibilidad() {
        return ocupado ? "Etá ocupado" : "Está libre";
    }

    @Override
    public String toString() {
        return "Amarre " + numero + " del tipo " + tipoAmarre + ". Longitud maxima de "
                + getLongitudMaxima() + "m con precio diario de " + getPrecioDia() + "€/dia."
                + consultarDisponibilidad();
    }

}
