package Ejercicios.src.Relacion3.Ejercicio4;

public class Stream {
    private static int numeroStreams;

    private int id;
    private Streamer streamer;
    private String titulo;
    private int duracionMin;
    private String categoria;
    private int mediaViewers;
    private String fecha;
    private boolean activo;
    
    public Stream( Streamer streamer, String titulo, int duracionMin, String categoria, int mediaViewers,
            String fecha, boolean activo) {
        numeroStreams++;
        setId(id);
        this.streamer = streamer;
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.categoria = categoria;
        this.mediaViewers = mediaViewers;
        this.fecha = fecha;
        this.activo = activo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = numeroStreams;
    }

    public Streamer getStreamer() {
        return streamer;
    }

    public void setStreamer(Streamer streamer) {
        this.streamer = streamer;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getMediaViewers() {
        return mediaViewers;
    }

    public void setMediaViewers(int mediaViewers) {
        this.mediaViewers = mediaViewers;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    }
