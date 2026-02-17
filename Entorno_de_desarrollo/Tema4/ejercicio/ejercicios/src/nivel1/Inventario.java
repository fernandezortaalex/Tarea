import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private final List<Producto> productos = new ArrayList<>();

    /**
     * Añade un producto al array de Producto
     * @param producto Producto a introducir en el array
     * @throws IllegalArgumentException Si el producto es {@code null} muestra un mensaje de error
     */
    public void agregarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser null");
        }

        productos.add(producto);
    }

    /**
     * Busca un producto en el array segun su codigo 
     * @param codigo Codigo a buscar en el array
     * @return producto final ya encontrado 
     */
    public Producto buscarPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }

        return null;
    }

    /**
     * Muenstra el numero total de productos
     * @return Cantidad total de productos en el array
     */
    public int totalProductos() {
        return productos.size();
    }
}