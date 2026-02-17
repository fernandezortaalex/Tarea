
public class Producto {
    private static int numeroProductos = 0;
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    Producto(String nombre, String descripcion, double precio, int cantidadEnStock) {
        setId();
        this.nombre = nombre;
        this.descripcion = descripcion;
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
    }

    @Override
    public String toString() {
        return nombre + ": " + descripcion + " PRECIO : " + precio + "€.\n--Unidades en Stock: " + cantidadEnStock;
    }

    public String getId() {
        return id;
    }

    private void setId() {
        this.id = "P-" + numeroProductos;
        numeroProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean setPrecio(double precio) {
        boolean precioCorrecto = false;
        if (precio >= 0) {
            this.precio = precio;
            precioCorrecto = true;
        }
        return precioCorrecto;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    /**
     * Si ese numero es mayor o igual a 0 cantidad en stock
     * actualizo el atributo cantidadEnStock
     * @param cantidadEnStock Le llega un numero
     * @return
     */
    public boolean setCantidadEnStock(int cantidadEnStock) {
        boolean cantidadEnStockCorrecto = false;
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
            cantidadEnStockCorrecto = true;
        }
        return cantidadEnStockCorrecto;
    }

}