package Tarea_Programacion.Tema5.Relacion2.Ejercicio3;

public class Producto {
    private static int numeroProductos = 0;
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;

    public Producto(String id, String nombre, String descripcion, double precio, int cantidadEnStock) {
        this.id = "P-" + numeroProductos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        numeroProductos++;
    }

    
}
