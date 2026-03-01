package Ejercicios.src.Relacion3.Ejercicio4;

public class Streamer {
    private static int numeroStreamer = 1;
    private int id;
    private String nombreCanal;
    private int seguidores;
    private String categoriaPrincipal;
    private String pais;

    public Streamer(String nombreCanal, int seguidores, String categoriaPrincipal, String pais) {
        setId(id);
        numeroStreamer++;
        this.nombreCanal = nombreCanal;
        this.seguidores = seguidores;
        this.categoriaPrincipal = categoriaPrincipal;
        this.pais = pais;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = numeroStreamer;

    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getCategoriaPrincipal() {
        return categoriaPrincipal;
    }

    public void setCategoriaPrincipal(String categoriaPrincipal) {
        this.categoriaPrincipal = categoriaPrincipal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "\n--- DATOS DEL STREAMER ---" +
                "\nID:          " + id +
                "\nNombre:      " + nombreCanal +
                "\nSeguidores:  " + seguidores +
                "\nCategoría:   " + categoriaPrincipal +
                "\nPaís:        " + pais +
                "\n--------------------------";
    }

}
