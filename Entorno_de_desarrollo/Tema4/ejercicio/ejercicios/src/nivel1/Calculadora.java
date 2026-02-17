
public class Calculadora {
    /**
     * Calcula un interes simple segun una cantidad de años
     * @param capital Dinero a calcular el interes
     * @param tasa Interes a añadir
     * @param anios Duracion que va a durar ese interes
     * @return Devuelve el valor ya calculado
     * @throws IllegalArgumentException Excepcion por si los datos introducidos no son correctos
     */
    public double calcularInteresSimple(double capital, double tasa, int anios) {
        if (capital < 0 || tasa < 0 || anios < 0) {
            throw new IllegalArgumentException("Los valores no pueden ser negativos");
        }

        return capital * tasa * anios;
    }

    /**
     * Calcula un descuento segun un porcentaje
     * @param precio Precio al aplicar el descuento
     * @param porcentaje Porcentaje de descuento a aplicar
     * @return Devuelve el precio ya calculado 
     * @throws IllegalArgumentException Mensaje por si los datos introducidos no son correctos
     */

    public double calcularDescuento(double precio, double porcentaje) {
        if (precio < 0 || porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("Valores no válidos");
        }

        return precio - (precio * porcentaje / 100);
    }

    /**
     * Calcula la conversion de euros a dolares
     * @param euros Dinero a saber el cambio
     * @param cambio Cantidad a cambiar
     * @return Devuelve el resultado de la operacion
     * @throws IllegalArgumentException Si la cantidad de euros es menor a 0 o el cambio es menor
     *                                  o igual a 0 salta un mensaje
     */
    public double convertirEurosADolares(double euros, double cambio) {
        if (euros < 0 || cambio <= 0) {
            throw new IllegalArgumentException("Valores no válidos");
        }

        return euros * cambio;
    }
}
