package EjerciciosT6.src.Relacion1.Ejercicio1;

class Lavadora extends Electrodomestico {
    
    double capacidadCarga;

    public Lavadora(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    

    @Override
    public String toString() {
        return "Lavadora [capacidadCarga=" + capacidadCarga + super.toString() + "]";
    }
    
}
