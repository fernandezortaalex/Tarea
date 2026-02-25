package Ejercicios.src.Relacion3.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tramite {
    private final static ArrayList<String> TIPOSVALIDOS = new ArrayList<>(
            Arrays.asList("TRAMITE DE EXTRANJERIA", "GESTION DE HERENCIAS", "CONSTITUCION DE SOCIEDAD"));
    private static int numeroCodigo = 1;
    private String codigo;
    private String nombreTramite;
    private double precioBase;
    private boolean requiereCita;
    private int duracionDias;

    public Tramite(String nombreTramite, double precioBase, int duracionDias) {
        setCodigo(codigo);
        numeroCodigo++;

        setNombreTramite(nombreTramite);
        setPrecioBase(precioBase);
        setRequiereCita(requiereCita);
        setDuracionDias(duracionDias);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = "T-" + numeroCodigo;

    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    private void imprimirMensajeError(String mensajeError) {
        System.err.println(mensajeError);
    }

    public double getPrecioBase() {
        if (precioBase == -1) {
            imprimirMensajeError("EL PRECIO BASE DEBE SER MAYOR A 0");
        }
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase >= 0) {
            this.precioBase = precioBase;

        } else {
            this.precioBase = -1;
        }
    }

    public boolean isRequiereCita() {
        return requiereCita;
    }

    public void setRequiereCita(boolean requiereCita) {
        if (TIPOSVALIDOS.contains(nombreTramite.toUpperCase())) {
            this.requiereCita = true;

        } else {
            this.requiereCita = false;
        }
    }

    public int getDuracionDias() {
        if (duracionDias == -1) {
            imprimirMensajeError("DEBE HABER 1 O MAS DIAS");
        }
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        if (duracionDias >= 1) {
            this.duracionDias = duracionDias;

        } else {
            this.duracionDias = -1;
        }
    }

    @Override
    public String toString() {

        return "\n TRÁMITE: " + nombreTramite + " [" + codigo + "]" +
                "\n   Precio:    " + getPrecioBase() + "€" +
                "\n   Duración:  " + getDuracionDias() + " días" +
                "\n   Cita requiere:  " + requiereCita;
    }

}
