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

    /**
     * Muestro el valor del id
     * @return
     */
    public int getId(){
        return id;
    }

    /**
     * Si es mayor o igual a 0 guardo el valor del id
     * @param id
     */
    public void setId(int id){
        if (id >= 0) {
            this.id = id;
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void getAutor(String autor){
        this.autor = autor;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    public void getSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }

    public Boolean getDisponible(){
        return disponible;
    }

    public void getDisponible(boolean disponible){
        this.disponible = disponible;
    }
}
