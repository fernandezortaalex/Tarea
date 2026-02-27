package Ejercicios.src.Relacion3.Ejercicio2;

import java.util.ArrayList;

public class Gestoria {
    private String nombre;
    public String direccion;
    public String telefono;
    private String horario;
    private ArrayList<Cliente> clientes;
    private ArrayList<Tramite> tramites;
    private ArrayList<Expediente> expedientes;

    /**
     * Constructor
     * 
     * @param clientes
     * @param tramites
     * @param expedientes
     */
    public Gestoria(String nombre, String direccion, String telefono, String horario) {
        setNombre(nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        setHorario(horario);
        inicializarClientes();
        setTramites(tramites);
        setExpedientes(expedientes);
    }
    
    /**
     * Para inicializarlo
     */
    private void inicializarClientes(){
        clientes = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        if (clientes == null) {
            this.clientes = new ArrayList<>();
        } else {
            this.clientes = clientes;
        }
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        if (tramites == null) {
            this.tramites = new ArrayList<>();
        } else {
            this.tramites = tramites;
        }
    }

    public ArrayList<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(ArrayList<Expediente> expedientes) {
        if (expedientes == null) {
            this.expedientes = new ArrayList<>();
        } else {
            this.expedientes = expedientes;
        }
    }

    @Override
    public String toString() {
        return "\n--- DATOS GESTORÍA ---\n" +
                "Nombre: " + nombre + "\n" +
                "Dirección: " + direccion + "\n" +
                "Telefono: " + telefono + "\n" +
                "Horario: " + horario + "\n" +
                "----------------------\n" +
                "Clientes: " + clientes + "\n" +
                "Trámites: " + tramites + " \n" +
                "Expedientes: " + expedientes + " \n";
    }

    private void imprimirMensajeError(String mensajeError) {
        System.err.println(mensajeError);
    }

    private void imprimirMensaje(String mensajeError) {
        System.out.println(mensajeError);
    }

    /**
     * Metodo para añadir cliente a {@link Cliente}.
     * 
     * Si el dni del cliente a añadir {@link Cliente#getDni()} es distinto al dni
     * del cliente a añadir se añade el cliente
     * 
     * @param nuevoCliente Nuevo cliente a añadir
     */
    public void altaCliente(Cliente nuevoCliente) {
        boolean clienteRepetido = false;
        for (int i = 0; i < clientes.size() && clienteRepetido == false; i++) {

            if (clientes.get(i).getDni().equalsIgnoreCase(nuevoCliente.getDni())) {
                clienteRepetido = true;
            }
        }

        if (clienteRepetido == true) {
            imprimirMensajeError("El dni esta repetido, no se puede añadir el cliente");
        } else {
            clientes.add(nuevoCliente);
            imprimirMensaje("El cliente ha sido añadido correctamente");
        }
    }

    /**
     * Añado un nuevo tramite, la validadcion de que no puede tener el mismo codigo,
     * la hago en {@link Tramite#setCodigo(String)}, ya que ahi genero el codigo de
     * forma automatica
     * 
     * @param nuevoTramite Tramite a añadir
     */
    public void altaTramite(Tramite nuevoTramite) {
        tramites.add(nuevoTramite);
        imprimirMensaje("Tramite añadido con exito");
    }

    /**
     * Metodo añadir expediente
     * @param nuevoExpediente expediente a añadir
     */
    public void abrirExpediente(Expediente nuevoExpediente){
        expedientes.add(nuevoExpediente);
    }

    /**
     * Metodo para cambiar estado de {@link Expediente#getEstado()},
     * para ello primero tiene que pasar por {@code "en proceso"}
     * @param estado
     */
    public void cambiarEstadoExpediente(Expediente estado){
        if (estado.getEstado().equalsIgnoreCase("abierto")) {
            estado.setEstado("en proceso");
        }else if (estado.getEstado().equalsIgnoreCase("en proceso")) {
            estado.setEstado("finalizado");
            
        }
    }
}
