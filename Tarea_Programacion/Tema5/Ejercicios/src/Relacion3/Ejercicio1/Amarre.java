package Ejercicios.src.Relacion3.Ejercicio1;

public class Amarre {
    private int numero;
    private double longitudMaxima;
    public double precioDia;
    private boolean ocupado;
    public String tipoAmarre;

    public Amarre(int numero, double longitudMaxima, boolean ocupado, String tipoAmarre) {
        setNumero(numero);
        setLongitudMaxima(longitudMaxima);
        setOcupado(ocupado);
    }

    /**
     * Numero
     */
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    
    /**
     * Longitud maxima
    */
    public double getLongitudMaxima() {
        return longitudMaxima;
    }
    public void setLongitudMaxima(double longitudMaxima) {
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
            
        }
    }

    /**
     * Ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    


    
}
