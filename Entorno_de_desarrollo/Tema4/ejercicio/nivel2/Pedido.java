import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final Cliente cliente;
    private final List<String> productos = new ArrayList<>();

    /**
     * 
     * @param cliente
     */
    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser null");
        }

        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void agregarProducto(String nombreProducto) {
        productos.add(nombreProducto);
    }

    public List<String> getProductos() {
        return productos;
    }
}