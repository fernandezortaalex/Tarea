package src.Relacion1.Ejercicio1;

class Televisor extends Electrodomestico {
    
    double tamanioPantalla;

    public Televisor(String marca, String modelo, double tamanioPantalla) {
        super(marca, modelo);
        this.tamanioPantalla = tamanioPantalla;
    }

    

    @Override
    public String toString() {
        return "Televisor [tamanioPantalla=" + tamanioPantalla + super.toString() + "]";
    }
    
}
