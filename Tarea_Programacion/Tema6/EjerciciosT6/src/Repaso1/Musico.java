public class Musico extends PersonaAgrupacion {
    private String instrumentoPrincipal;
    private int nivel;
    private int asistenciaEnsayos;
    private double valorBase;
    public Musico(String nombre, int edad, int antiguedad, String instrumentoPrincipal, int nivel,
            int asistenciaEnsayos, double valorBase) {
        super(nombre, edad, antiguedad);
        this.instrumentoPrincipal = instrumentoPrincipal;
        this.nivel = nivel;
        this.asistenciaEnsayos = asistenciaEnsayos;
        this.valorBase = valorBase;
    }
    public String getInstrumentoPrincipal() {
        return instrumentoPrincipal;
    }
    public void setInstrumentoPrincipal(String instrumentoPrincipal) {
        this.instrumentoPrincipal = instrumentoPrincipal;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getAsistenciaEnsayos() {
        return asistenciaEnsayos;
    }
    public void setAsistenciaEnsayos(int asistenciaEnsayos) {
        this.asistenciaEnsayos = asistenciaEnsayos;
    }
    public double getValorBase() {
        return valorBase;
    }
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    
    @Override
    public double calcularAportacion() {
        return valorBase + (nivel * 2) + (asistenciaEnsayos * 1.5);
    }

    @Override
    public boolean puedeParticipar() {
        boolean participa = false;
        if (asistenciaEnsayos >= 3) {
            participa = true;
        }
        return participa;
    }

    public void registrarEnsayo(){
        asistenciaEnsayos++;
    }
    public void subirNivel(){
        nivel++;
    }

}
