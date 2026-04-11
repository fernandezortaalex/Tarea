package src.Relacion1.Ejercicio4;


class Domestico extends Animales {
    private String dueno;

    public Domestico(String nombre, String tipoAlimentacion) {
        super(nombre, tipoAlimentacion);
        this.dueno = "Alex";
    }
    
    public String convivirConHumanos(){
        return "El animal doméstico " + nombre + " convive con su dueño "+ dueno+" y se alimenta de " +tipoAlimentacion +".";
    }

    @Override
    public String toString() {
        return convivirConHumanos();
    }
    
}
