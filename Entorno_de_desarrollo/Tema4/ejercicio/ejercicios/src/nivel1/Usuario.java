public class Usuario {

    private final String nombre;
    private final String dni;

    /**
     * Crea un usuario con esos datos
     * @param nombre Nombre de la persona a introducir
     * @param dni Dni de la persona a introducir
     * @throws IllegalArgumentException Si el nombre o el dni son nulos devuelve un mensaje
     *                                  de error
    */
    public Usuario(String nombre, String dni) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (dni == null || dni.isBlank()) {
            throw new IllegalArgumentException("El DNI no puede estar vacío");
        }

        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Muestra el nombre
     * @return Nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el dni del usuario
     * @return Dni completo del usuario
     */
    public String getDni() {
        return dni;
    }
}