package src.Repaso2;

public class Pianista extends Instrumentista implements Tocable{
    private int numeroInstrumentos;
    private double valorInstrumentos;
    private int acompanamientosPreparados;
    private int precision;
    public Pianista(String nombreArtistico, String localidad, int anosEnLaAgrupacion, double puntosBase,
            String instrumentoPrincipal, int nivelTecnico, int ensayosAsistidos, int actuacionesDisponibles,
            int numeroInstrumentos, double valorInstrumentos, int acompanamientosPreparados, int precision) {
        super(nombreArtistico, localidad, anosEnLaAgrupacion, puntosBase, instrumentoPrincipal, nivelTecnico,
                ensayosAsistidos, actuacionesDisponibles);
        this.numeroInstrumentos = numeroInstrumentos;
        this.valorInstrumentos = valorInstrumentos;
        this.acompanamientosPreparados = acompanamientosPreparados;
        this.precision = precision;
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
    public int getAcompanamientosPreparados() {
        return acompanamientosPreparados;
    }
    public void setAcompanamientosPreparados(int acompanamientosPreparados) {
        this.acompanamientosPreparados = acompanamientosPreparados;
    }
    public int getPrecision() {
        return precision;
    }
    public void setPrecision(int precision) {
        this.precision = precision;
    }
    @Override
    public double calcularRendimiento() {
        return super.calcularRendimiento() + (acompanamientosPreparados * 3) + precision + (valorInstrumentos * 0.015);
    }
    @Override
    public boolean estaDisponible() {
        boolean disponible = false;
        if (super.estaDisponible() && precision >= 5) {
            disponible = true;
        }
        return disponible;
    }
    @Override
    public boolean asignarInstrumento(String nombre, double valor) {
        boolean asignado = false;
        if (nombre != null && !nombre.isEmpty() && valor > 0) {
            numeroInstrumentos++;
            valorInstrumentos += valor;
            asignado = true;
        }
        return asignado;
    }
    @Override
    public boolean retirarInstrumento(String nombre, double valor) {
        boolean instrumentoRetirado = false;
        if (numeroInstrumentos > 0 && valor > 0) {
            numeroInstrumentos--;
            valorInstrumentos -= valor;
            if (valorInstrumentos <= 0 ) {
                valorInstrumentos = 0;
            }
            instrumentoRetirado = true;
        }
        return instrumentoRetirado;
    }
    public void prepararAcompanamiento(){
        acompanamientosPreparados++;
    }
    public void aumentarPrecision(int cantidad){
        if (cantidad > 0) {
            precision += cantidad;
        }
    }

    public static void main(String[] args) {
        Pianista pianista = new Pianista("Alex", "Granada", 3, 200, "Guiotarra", 4, 8, 1, 5, 100, 1, 5);
        System.out.println(pianista.estaDisponible());
    }
}
