package Ejercicios.src.EjercicioExamen;

public class Animal {

    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;

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
        this.codigo = Faker.codigoAnimal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
            
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0.0) {
            this.precio = precio;
            
        }
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo  + " | Nombre: " + nombre  + "  | Cantidad: " + cantidad + " | Precio: " + precio + "\n";
    }

    

    
}
