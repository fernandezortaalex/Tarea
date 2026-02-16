import java.util.ArrayList;

import Tarea_Programacion.Tema5.Relacion2.Ejercicio1.Estudiante;

public class supermercado {
    
    ArrayList<Productos> producto;

    /**
     * Construyo un nuevo array
     */
    public supermercado(){
        this.producto = new ArrayList<>();
    }

    /**
     * Agrego un alimento al array de producto
     * @param alimento
     */
    public void agregarProducto(Producto alimento){
        producto.add(alimento);
    }

    /**
     * Eliminar un alimento del array
     * @param alimento
     */
    public void venderProducto(Producto alimento){
        producto.remove(alimento);
    } 

    public String mostrarInventario(){
        String stringInventario = "";
        for (Productos alimento : producto) {
            stringInventario += "--" + alimento + "\n";
        }
        return stringInventario;
    }
}
