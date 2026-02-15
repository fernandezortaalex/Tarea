public class Libro {
    //Atributos
    private int id;
    private String titulo;
    private String autor;
    private String sinopsis;
    private boolean disponible;

    /**
     * constructor
     */
    public Libro(int id, String titulo, String autor, String sinopsis, boolean disponible){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.disponible = disponible;
    }
}
