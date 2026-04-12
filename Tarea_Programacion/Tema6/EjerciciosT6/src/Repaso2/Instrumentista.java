package src.Repaso2;


public class Instrumentista extends MiembroBanda{
    private String instrumentoPrincipal;
    private int nivelTecnico;
    private int ensayosAsistidos;
    private int actuacionesDisponibles;
    public Instrumentista(String nombreArtistico, String localidad, int anosEnLaAgrupacion, double puntosBase,
            String instrumentoPrincipal, int nivelTecnico, int ensayosAsistidos, int actuacionesDisponibles) {
        super(nombreArtistico, localidad, anosEnLaAgrupacion, puntosBase);
        this.instrumentoPrincipal = instrumentoPrincipal;
        this.nivelTecnico = nivelTecnico;
        this.ensayosAsistidos = ensayosAsistidos;
        this.actuacionesDisponibles = actuacionesDisponibles;
    }
    public String getInstrumentoPrincipal() {
        return instrumentoPrincipal;
    }
    public void setInstrumentoPrincipal(String instrumentoPrincipal) {
        this.instrumentoPrincipal = instrumentoPrincipal;
    }
    public int getNivelTecnico() {
        return nivelTecnico;
    }
    public void setNivelTecnico(int nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }
    public int getEnsayosAsistidos() {
        return ensayosAsistidos;
    }
    public void setEnsayosAsistidos(int ensayosAsistidos) {
        this.ensayosAsistidos = ensayosAsistidos;
    }
    public int getActuacionesDisponibles() {
        return actuacionesDisponibles;
    }
    public void setActuacionesDisponibles(int actuacionesDisponibles) {
        this.actuacionesDisponibles = actuacionesDisponibles;
    }
    @Override
    public double calcularRendimiento() {
        
        return getPuntosBase() + (nivelTecnico * 5) + (ensayosAsistidos * 2);
    }
    @Override
    public boolean estaDisponible() {
        boolean disponible = false;
        if (actuacionesDisponibles > 0) {
            disponible = true;
        }
        return disponible;
    }
    public void registrarEnsayo(){
        ensayosAsistidos++;
    }
    public void consumirActuacion(){
        if (actuacionesDisponibles > 0) {
            actuacionesDisponibles--;
        }
    }
    

    public static void main(String[] args) {
        Instrumentista instrumentista = new Instrumentista("Alex", "Granada", 5, 20, "saxofon", 8, 6, 0);
        System.out.println(instrumentista.calcularRendimiento());
        System.out.println(instrumentista.estaDisponible());
        instrumentista.registrarEnsayo();
        instrumentista.consumirActuacion();

        System.out.println(instrumentista.ensayosAsistidos);
        System.out.println(instrumentista.actuacionesDisponibles);
    }
}
