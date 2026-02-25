package Ejercicios.src.Relacion3.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Expediente {
    private final static ArrayList<String> VALIDO = new ArrayList<>(
            Arrays.asList("ABIERTO", "EN PROCESO", "FINALIZADO"));
    private static int codigoExpediente = 1;
    private int numeroExpediente;
    private Cliente cliente;
    private Tramite tramite;
    private String estado;
    private boolean pagado;
    public String fechaApertura;

    public Expediente(Cliente cliente, Tramite tramite, String fechaApertura) {
        this.numeroExpediente = codigoExpediente;
        codigoExpediente++;
        this.cliente = cliente;
        this.tramite = tramite;
        // El estado por defecto es abierto
        this.estado = "ABIERTO";
        setPagado(pagado);
        this.fechaApertura = fechaApertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public String getEstado() {
        return estado;
    }

    /**
     * El estado debe ser abierto, en proceso o finalizado
     * 
     * @param estado
     */
    public void setEstado(String estado) {
        if (VALIDO.contains(estado.toUpperCase())) {
            this.estado = estado;

        } else {
            this.estado = "EL PROCESO DEBE SER ABIERTO EN PROCESO O FINALIZADO";
        }
    }

    public boolean isPagado() {
        return pagado;
    }

    /**
     * Un expediente no puede estar pagado si el estado es abierto
     * 
     * @param pagado
     */
    public void setPagado(boolean pagado) {
        if (estado.equalsIgnoreCase("abierto")) {
            this.pagado = false;
        } else {
            this.pagado = true;
        }
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    @Override
    public String toString() {
        
        return "\n EXPEDIENTE Nº: " + numeroExpediente + " [" + estado + "]" +
                "\n   Cliente:    " + cliente.getNombre() + " (" + cliente.getDni() + ")" +
                "\n   Trámite:    " + tramite.getNombreTramite() +
                "\n   Fecha:      " + fechaApertura +
                "\n   Pago:       " + pagado;
    }

}
