/**
 * Clase para un cliente el cual tiene un id y un nombre
 * 
 */
public class Cliente {

    private final String id;
    private final String nombre;

    /**
     * Crea un cliente con un id y un nombre 
     * @param id identificador a utilizar 
     * @param nombre nombre a utilizar 
     * @throws IllegalArgumentException si alguno de los dos es nulo o esta vacio 
     */
    public Cliente(String id, String nombre) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El id no puede estar vacío");
        }

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Obtener id cliente
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Obtener nombre cliente
     * @return
     */
    public String getNombre() {
        return nombre;
    }
}