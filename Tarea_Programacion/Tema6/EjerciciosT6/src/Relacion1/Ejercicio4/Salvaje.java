package EjerciciosT6.src.Relacion1.Ejercicio4;

class Salvaje extends Animales{
    private String habitat;

    public Salvaje(String nombre, String tipoAlimentacion) {
        super(nombre, tipoAlimentacion);
        this.habitat = "selva";
    }
    
    public String cazar(){
        return "El animal salvaje "+ nombre +" caza en su hábitat "+habitat+" y se alimenta de"+  tipoAlimentacion;
    }

    @Override
    public String toString() {
        return cazar();
    }
}
