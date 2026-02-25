package Ejercicios.src.Relacion3.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Expediente {
    private final static ArrayList<String> VALIDO = new ArrayList<>(Arrays.asList("ABIERTO", "EN PROCESO", "FINALIZADO"));
    private static int codigoExpediente = 1;
    private int numeroExpediente;
    private Cliente cliente;
    private Tramite tramite;
    private String estado;
    private boolean pagado;
    public String fechaApertura;

    public Expediente(Cliente cliente, Tramite tramite, boolean pagado,String fechaApertura) {
        this.numeroExpediente = codigoExpediente;
        codigoExpediente++;
        this.cliente = cliente;
        this.tramite = tramite;
        this.estado = "ABIERTO";
        this.pagado = pagado;
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
    public void setEstado(String estado) {
        if (VALIDO.contains(estado.toUpperCase())) {
            this.estado = estado;
            
        }else{
            this.estado = "EL PROCESO DEBE SER ABIERTO EN PROCESO O FINALIZADO";
        }
    }

    public boolean isPagado() {
        return pagado;
    }
    public void setPagado(boolean pagado) {
        if (estado.equalsIgnoreCase("abierto")) {
            this.pagado = false;
        }else{
            this.pagado = true;
        }
    }

    public String getFechaApertura() {
        return fechaApertura;
    }
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    
    
}
