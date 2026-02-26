package Ejercicios.src.EjercicioExamen;

public class Animal {

    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;
    private static int numeroCodigo = 1;

    /**
     * Constructor
     * @param nombre
     * @param codigo
     * @param cantidad
     * @param precio
     */
    public Animal(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        setCodigo(codigo);
        numeroCodigo++;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    /**
     * Creo el codigo de forma automatica
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = "A" + numeroCodigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

    
}
