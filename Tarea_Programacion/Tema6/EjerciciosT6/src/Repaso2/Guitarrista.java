package src.Repaso2;

public class Guitarrista extends Instrumentista implements Tocable, Revisable{
    private int numeroInstrumentos;
    private double valorInstrumentos;
    private int solosPreparados;
    private int partiturasRevisadas;
    private int erroresDetectados;
    public Guitarrista(String nombreArtistico, String localidad, int anosEnLaAgrupacion, double puntosBase,
            String instrumentoPrincipal, int nivelTecnico, int ensayosAsistidos, int actuacionesDisponibles,
            int numeroInstrumentos, double valorInstrumentos, int solosPreparados, int partiturasRevisadas,
            int erroresDetectados) {
        super(nombreArtistico, localidad, anosEnLaAgrupacion, puntosBase, instrumentoPrincipal, nivelTecnico,
                ensayosAsistidos, actuacionesDisponibles);
        this.numeroInstrumentos = numeroInstrumentos;
        this.valorInstrumentos = valorInstrumentos;
        this.solosPreparados = solosPreparados;
        this.partiturasRevisadas = partiturasRevisadas;
        this.erroresDetectados = erroresDetectados;
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
    public int getSolosPreparados() {
        return solosPreparados;
    }
    public void setSolosPreparados(int solosPreparados) {
        this.solosPreparados = solosPreparados;
    }
    public int getPartiturasRevisadas() {
        return partiturasRevisadas;
    }
    public void setPartiturasRevisadas(int partiturasRevisadas) {
        this.partiturasRevisadas = partiturasRevisadas;
    }
    public int getErroresDetectados() {
        return erroresDetectados;
    }
    public void setErroresDetectados(int erroresDetectados) {
        this.erroresDetectados = erroresDetectados;
    }
    @Override
    public double calcularRendimiento() {
        
        return super.calcularRendimiento() + (solosPreparados * 4) + (partiturasRevisadas * 1.5) - erroresDetectados + (valorInstrumentos * 0.02);
    }
    
    @Override
    public boolean estaDisponible() {
        boolean disponible = false;
        if (super.estaDisponible() && solosPreparados >= 1) {
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
    @Override
    public void sumarPartiturasRevisadas() {
        partiturasRevisadas++;
        
    }
    @Override
    public void sumarErroresDetectados(int cantidad) {
        if (cantidad > 0) {
            erroresDetectados += cantidad;
        }
        
    }
    public void prepararSolo(){
        solosPreparados++;
    }
    public void corregirError(){
        if (erroresDetectados > 0) {
            erroresDetectados--;
        }
    }


    public static void main(String[] args) {
        Guitarrista guitarrista = new Guitarrista("Alex", "Granada", 3, 200, "Guiotarra", 4, 8, 1, 5, 100, 1, 1, 4);
        System.out.println(guitarrista.estaDisponible());
        guitarrista.asignarInstrumento("", 200);
        System.out.println(guitarrista.numeroInstrumentos);
        
        System.out.println( guitarrista.retirarInstrumento("asefs", 200));
        System.out.println(guitarrista.valorInstrumentos);

    }
}
