package Ejercicios.src.Relacion2.EjercicioDos;

public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private String sinopsis;
    private Boolean disponible;

    /**
     * Creo el constructor
     */
    public Libro(String id, String titulo, String autor, String sinopsis, Boolean disponible){
        setId(id);
        this.titulo = titulo;
        this.autor = autor;
        setSinopsis(sinopsis);
        this.disponible = disponible;
    }
    public Libro() {
    }


    /**
     * Llamo al id
     * @return
     */
    public String getId(){
        return id;
    }
    /**
     * Modifico el id
     * El nuevo id solo se asignara si empieza con Stem
     */
    public void setId(String id){
        if (id.startsWith("Stem")) {
            this.id = id;
        }
    }

    //Titulo
    public String getTitulo(String titulo){
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Autor
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //sinopsis
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis){
        if (sinopsis.length() > 5) {
            this.sinopsis = sinopsis;
        }
    }

    //Disponible
    public boolean getDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        StringBuilder mostrarLibro = new StringBuilder();
        mostrarLibro.append("Libro: ");
        mostrarLibro.append("id=").append(id);
        mostrarLibro.append(", titulo=").append(titulo);
        mostrarLibro.append(", autor=").append(autor);
        mostrarLibro.append(", sinopsis=").append(sinopsis);
        if (disponible) {
            mostrarLibro.append("el libro esta disponible");
        }else{
            mostrarLibro.append("el libro no esta disponible");
        }
        return mostrarLibro.toString();
        
    }


}
