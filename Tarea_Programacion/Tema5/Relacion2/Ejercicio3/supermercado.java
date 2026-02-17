import java.util.ArrayList;

import Tarea_Programacion.Tema5.Relacion2.Ejercicio1.Estudiante;

public class Supermercado {
    
    ArrayList<Producto> articulos;

    /**
     * Creo el constructor
     * @param producto
     */
    public Supermercado(ArrayList<Producto> articulos) {
        this.articulos = articulos;
    }

    /**
     * Construyo un nuevo array
     */
    public Supermercado() {
        articulos = new ArrayList<>();
    }


    /**
     * Agrego un producto al array de Producto
     * @param alimento
     */
    public void agregarArticulo(Producto producto) {
        articulos.add(producto);
    }

    /**
     * Si en el array esta el producto (se busca el producto entero),
     * Creo una variable en la cual le guardo la cantidad que se introdujo en el objeto y se le resta 
     * a cantidad compra.
     * Si la cantidad restante es mayor o igual a 0 llamas a la clase cantidadStock con la cantidad restante
     * para actualizar la cantidad en stock.
     * @param producto Le pasas el objeto 
     * @param cantidadComprar cantidad ah vender 
     */
    public void venderArticulo(Producto producto, int cantidadComprar) {
        if (articulos.contains(producto)) {
            int cantidadRestante=producto.getCantidadStock()-cantidadComprar;
            if (cantidadRestante>=0) {
                producto.setCantidadStock(cantidadRestante);
            }
        }
    }

    public String mostrarInventario(){
        String stringInventario = "";
        for (int i = 1; i <= producto.size(); i++) {
            stringInventario += "Supermercado --> articulo" + i + ":" + producto.get(i - 1) + "\n";
            
        }
        return stringInventario;
    }
}
