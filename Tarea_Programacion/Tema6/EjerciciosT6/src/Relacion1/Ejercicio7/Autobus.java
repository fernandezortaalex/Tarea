package src.Relacion1.Ejercicio7;

public class Autobus implements Transporte {
    String horaParada;
    String horaSalida;
    
    public Autobus(String horaParada, String horaSalida) {
        this.horaParada = horaParada;
        this.horaSalida = horaSalida;
    }

    public String arrancar(){
        return "El bus arranco";
    }
    public String detener(){
        return "El bus se detuvo";
    }

    @Override
    public String toString() {
        return "Autobus [horaParada=" + horaParada + ", horaSalida=" + horaSalida + ", arrancar()=" + arrancar()
                + ", detener()=" + detener() + "]";
    }

    
}
