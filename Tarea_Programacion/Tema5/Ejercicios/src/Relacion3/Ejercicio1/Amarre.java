package Ejercicios.src.Relacion3.Ejercicio1;

public class Amarre {
    private int numero;
    private double longitudMaxima;
    //Al tener restricciones cambio a privada
    private double precioDia;
    private boolean ocupado;
    //Al tener restricciones cambio a privada
    private String tipoAmarre;
    

    public Amarre(int numero, double longitudMaxima, double precioDia, boolean ocupado, String tipoAmarre) {
        setNumero(numero);
        setLongitudMaxima(longitudMaxima);
        this.precioDia = precioDia;
        setOcupado(ocupado);
        this.tipoAmarre = tipoAmarre;
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
