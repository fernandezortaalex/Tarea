public class Trompetista extends Musico implements Asignable {
    private int numeroInstrumentos;
    private double valorInstrumentos;
    private int resistencia;
    private int numeroSolos;
    public Trompetista(String nombre, int edad, int antiguedad, String instrumentoPrincipal, int nivel,
            int asistenciaEnsayos, double valorBase, int numeroInstrumentos, double valorInstrumentos, int resistencia,
            int numeroSolos) {
        super(nombre, edad, antiguedad, instrumentoPrincipal, nivel, asistenciaEnsayos, valorBase);
        this.numeroInstrumentos = numeroInstrumentos;
        this.valorInstrumentos = valorInstrumentos;
        this.resistencia = resistencia;
        this.numeroSolos = numeroSolos;
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
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public int getNumeroSolos() {
        return numeroSolos;
    }
    public void setNumeroSolos(int numeroSolos) {
        this.numeroSolos = numeroSolos;
    }
    @Override
    public double calcularAportacion() {
        return super.calcularAportacion() + resistencia + (numeroSolos * 3) + (valorInstrumentos * 0.05);
    }
    @Override
    public boolean puedeParticipar() {
        boolean participa = false;
        if (super.puedeParticipar() && resistencia >= 5) {
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
    public void registrarSolo(){
        numeroSolos++;
    }
    public void aumentarResistencia(int cantidad){
        if (cantidad > 0) {
            resistencia += cantidad;
        }
    }

    
}
