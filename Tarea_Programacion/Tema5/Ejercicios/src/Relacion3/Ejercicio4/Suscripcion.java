package Ejercicios.src.Relacion3.Ejercicio4;

public class Suscripcion {
    private static int numeroSuscripciones;
    private int id;
    private String usuario;
    private Streamer streamer;
    private int meses;
    private int tier;
    private String fechaInicio;

    /**
     * Constructor
     * @param id
     * @param usuario
     * @param streamer
     * @param meses
     * @param tier
     * @param fechaInicio
     */
    public Suscripcion(int id, String usuario, Streamer streamer, int meses, int tier, String fechaInicio) {
        setId(id);
        numeroSuscripciones++;
        this.usuario = usuario;
        this.streamer = streamer;
        this.meses = meses;
        this.tier = tier;
        this.fechaInicio = fechaInicio;
    }

    public static int getNumeroSuscripciones() {
        return numeroSuscripciones;
    }

    public static void setNumeroSuscripciones(int numeroSuscripciones) {
        Suscripcion.numeroSuscripciones = numeroSuscripciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = numeroSuscripciones;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Streamer getStreamer() {
        return streamer;
    }

    public void setStreamer(Streamer streamer) {
        this.streamer = streamer;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        if (tier != 1 && tier != 2 && tier != 3 ) {
            this.tier = 0;
        }else{
            this.tier = tier;
        }
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int precioMensual(){
        int precio = 0;
        if (tier == 1) {
            
        }
        return precio;
    }
}
