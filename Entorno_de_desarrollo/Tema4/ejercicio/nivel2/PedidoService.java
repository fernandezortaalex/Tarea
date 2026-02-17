public class PedidoService {

    public Pedido crearPedidoParaCliente(Cliente cliente) {
        return new Pedido(cliente);
    }

    /**
     * Este método queda obsoleto y se mantiene solo por compatibilidad.
     */
    @Deprecated
    public Pedido crearPedido(Cliente cliente) {
        return new Pedido(cliente);
    }
}