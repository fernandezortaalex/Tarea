package src.Repaso2;

import java.util.ArrayList;

public class ResponsableMusical extends MiembroBanda implements Coordinable, Revisable {
    private String repertorioSemana;
    private int numeroIntegrantesACargo;
    private ArrayList<MiembroBanda> integrantes;
    private int partiturasRevisadas;
    private int erroresDetectados;
    public ResponsableMusical(String nombreArtistico, String localidad, int anosEnLaAgrupacion, double puntosBase,
            String repertorioSemana, int numeroIntegrantesACargo, ArrayList<MiembroBanda> integrantes,
            int partiturasRevisadas, int erroresDetectados) {
        super(nombreArtistico, localidad, anosEnLaAgrupacion, puntosBase);
        this.repertorioSemana = repertorioSemana;
        this.numeroIntegrantesACargo = numeroIntegrantesACargo;
        this.integrantes = integrantes;
        this.partiturasRevisadas = partiturasRevisadas;
        this.erroresDetectados = erroresDetectados;
    }
    public String getRepertorioSemana() {
        return repertorioSemana;
    }
    public void setRepertorioSemana(String repertorioSemana) {
        this.repertorioSemana = repertorioSemana;
    }
    public int getNumeroIntegrantesACargo() {
        return numeroIntegrantesACargo;
    }
    public void setNumeroIntegrantesACargo(int numeroIntegrantesACargo) {
        this.numeroIntegrantesACargo = numeroIntegrantesACargo;
    }
    public ArrayList<MiembroBanda> getIntegrantes() {
        return integrantes;
    }
    public void setIntegrantes(ArrayList<MiembroBanda> integrantes) {
        this.integrantes = integrantes;
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
        
        return getPuntosBase() + (getAnosEnLaAgrupacion() * 4) + (numeroIntegrantesACargo * 3);
    }
    @Override
    public boolean estaDisponible() {
        boolean disponible = false;
        if (erroresDetectados <= 5) {
            disponible = true;
        }
        return disponible;
    }
    
    @Override
    public boolean asignarMiembro(MiembroBanda miembro) {
        boolean miembroAsignado = false;
        if (miembro != null) {
            boolean nombreRepetido = false;
            for (int i = 0; i < integrantes.size() && !miembroAsignado; i++) {
                if (integrantes.get(i).getNombreArtistico().equalsIgnoreCase(miembro.getNombreArtistico())) {
                    nombreRepetido = true;
                }
            }
            if (!nombreRepetido) {
                integrantes.add(miembro);
                numeroIntegrantesACargo = integrantes.size();
                miembroAsignado = true;
                
            }
        }
        return miembroAsignado;
    }
    @Override
    public boolean quitarMiembro(String nombreArtistico) {
        boolean encontrado = false;
        for (int i = 0; i < integrantes.size() && !encontrado; i++) {
            if (integrantes.get(i).getNombreArtistico().equalsIgnoreCase(nombreArtistico)) {
                encontrado = true;
                integrantes.remove(integrantes.get(i));
            }
        }
        if (encontrado) {
            numeroIntegrantesACargo = integrantes.size();
            
        }
        
        return encontrado;
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
    public double calcularRendimientoEquipo(){
        double resultado = 0;
        for (MiembroBanda miembroBanda : integrantes) {
            resultado += miembroBanda.calcularRendimiento();
        }
        return resultado;
    }

    public String mostrarIntegrantes(){
        String integrantes = "";
        for (MiembroBanda miembroBanda : this.integrantes) {
            integrantes += miembroBanda;
        }
        return integrantes;
    }
    public static void main(String[] args) {
        ResponsableMusical responsableMusical = new ResponsableMusical("Alex", "Granada", 5, 20, "aefsd", 8, new ArrayList<>(), 5, 5);
        ResponsableMusical musico1 = new ResponsableMusical("Juan", "Málaga", 2, 10, "", 0, new ArrayList<>(), 0, 5);
        ResponsableMusical musico2 = new ResponsableMusical("Maria", "Sevilla", 3, 15, "", 0, new ArrayList<>(), 0, 0);
        ResponsableMusical clonJuan = new ResponsableMusical("juan", "Cádiz", 1, 5, "", 0, new ArrayList<>(), 0, 0);
        // System.out.println(responsableMusical.calcularRendimiento());
        // System.out.println(responsableMusical.estaDisponible());

        System.out.println(responsableMusical.asignarMiembro(musico1));
        System.out.println(responsableMusical.asignarMiembro(musico2));
        System.out.println(responsableMusical.asignarMiembro(clonJuan));
        System.out.println(responsableMusical.quitarMiembro("Juan"));
        System.out.println(responsableMusical.mostrarIntegrantes());
        System.out.println(responsableMusical.calcularRendimientoEquipo());
        responsableMusical.sumarErroresDetectados(musico1.erroresDetectados);
        System.out.println(responsableMusical.erroresDetectados);
    }
}
