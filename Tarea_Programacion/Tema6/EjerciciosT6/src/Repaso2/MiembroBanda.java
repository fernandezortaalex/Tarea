package src.Repaso2;

abstract class MiembroBanda {
    private String nombreArtistico;
    private String localidad;
    private int anosEnLaAgrupacion;
    private double puntosBase;
    public MiembroBanda(String nombreArtistico, String localidad, int anosEnLaAgrupacion, double puntosBase) {
        this.nombreArtistico = nombreArtistico;
        this.localidad = localidad;
        this.anosEnLaAgrupacion = anosEnLaAgrupacion;
        this.puntosBase = puntosBase;
    }
    public String getNombreArtistico() {
        return nombreArtistico;
    }
    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public int getAnosEnLaAgrupacion() {
        return anosEnLaAgrupacion;
    }
    public void setAnosEnLaAgrupacion(int anosEnLaAgrupacion) {
        this.anosEnLaAgrupacion = anosEnLaAgrupacion;
    }
    public double getPuntosBase() {
        return puntosBase;
    }
    public void setPuntosBase(double puntosBase) {
        this.puntosBase = puntosBase;
    }
    
    public abstract double calcularRendimiento();
    public abstract boolean estaDisponible();
    public void sumarAnos(){
        anosEnLaAgrupacion++;
    };
    public void sumarPuntosBase(double puntos){
        if (puntos > 0) {
            puntosBase += puntos;
        }
    };
    @Override
    public String toString() {
        return "MiembroBanda [nombreArtistico=" + nombreArtistico + ", localidad=" + localidad + ", anosEnLaAgrupacion="
                + anosEnLaAgrupacion + ", puntosBase=" + puntosBase + "]";
    }
    
}
