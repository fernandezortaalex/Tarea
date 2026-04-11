public class Percusionista extends Musico implements Asignable {
    private int numeroInstrumentos;
    private double valorInstrumentos;
    private int potenciaGolpe;
    private int cambiosRitmoCorrectos;
    public Percusionista(String nombre, int edad, int antiguedad, String instrumentoPrincipal, int nivel,
            int asistenciaEnsayos, double valorBase, int numeroInstrumentos, double valorInstrumentos,
            int potenciaGolpe, int cambiosRitmoCorrectos) {
        super(nombre, edad, antiguedad, instrumentoPrincipal, nivel, asistenciaEnsayos, valorBase);
        this.numeroInstrumentos = numeroInstrumentos;
        this.valorInstrumentos = valorInstrumentos;
        this.potenciaGolpe = potenciaGolpe;
        this.cambiosRitmoCorrectos = cambiosRitmoCorrectos;
    }
    public int getNumeroInstrumentos() {
        return numeroInstrumentos;
    }
    public void setNumeroInstrumentos(int numeroInstrumentos) {
        this.numeroInstrumentos = numeroInstrumentos;
    }
    public double getValorInstrumentos() {
        return valorInstrumentos;
    }
    public void setValorInstrumentos(double valorInstrumentos) {
        this.valorInstrumentos = valorInstrumentos;
    }
    public int getPotenciaGolpe() {
        return potenciaGolpe;
    }
    public void setPotenciaGolpe(int potenciaGolpe) {
        this.potenciaGolpe = potenciaGolpe;
    }
    public int getCambiosRitmoCorrectos() {
        return cambiosRitmoCorrectos;
    }
    public void setCambiosRitmoCorrectos(int cambiosRitmoCorrectos) {
        this.cambiosRitmoCorrectos = cambiosRitmoCorrectos;
    }

    @Override
    public double calcularAportacion() {
        
        return super.calcularAportacion() + (potenciaGolpe * 2) + (cambiosRitmoCorrectos * 4) + (valorInstrumentos * 0.03);
    }
    @Override
    public boolean puedeParticipar() {
        boolean participa = false;
        if (super.puedeParticipar() && potenciaGolpe >= 4) {
            participa = true;
        }
        return participa;
    }
    @Override
    public boolean asignarInstrumento(String nombreInstrumento, double valorInstrumento) {
        boolean asignado = false;
        if (nombreInstrumento != null && !nombreInstrumento.isEmpty()) {
            if (valorInstrumento > 0) {
                numeroInstrumentos++;
                valorInstrumentos += valorInstrumento;
                asignado = true;
            }
        }
        return asignado;
    }
    @Override
    public boolean quitarInstrumento(String nombreInstrumento, double valorInstrumento) {
        boolean quitado = false;
        if (numeroInstrumentos > 0 && valorInstrumento > 0) {
            numeroInstrumentos--;
            valorInstrumentos -= valorInstrumento;
            if (valorInstrumentos <= 0) {
                valorInstrumentos = 0;
            }
            quitado = true;
        }
        return quitado;
    }
    public void registrarCambioRitmoCorrecto(){
        cambiosRitmoCorrectos++;
    }
    public void aumentarPotencia(int cantidad){
        if (cantidad > 0) {
            potenciaGolpe += cantidad;
        }
    }
}
