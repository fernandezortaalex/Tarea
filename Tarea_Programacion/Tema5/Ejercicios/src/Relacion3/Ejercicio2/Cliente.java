package Ejercicios.src.Relacion3.Ejercicio2;

public class Cliente {
    private static int numeroId;
    private int id;
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    private String direccion;

    public Cliente(String nombre, String dni, String telefono, String email, String direccion) {
        setId(id);
        numeroId++;

        this.nombre = nombre;
        setDni(dni);
        setTelefono(telefono);
        setEmail(email);
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = numeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (!dni.isBlank() && dni != null) {
            this.dni = dni;

        } else {
            this.dni = "DNI FALTA POR VALIDAR";
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() >= 9) {
            this.telefono = telefono;

        } else {
            this.telefono = "TELEFONO FALTA POR VALIDAR";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.equals("@")) {
            this.email = email;

        } else {
            this.email = "EMAIL FALTA POR VALIDAR";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        
        return "\n CLIENTE: " + nombre + " (ID: " + id + ")" +
                "\n   DNI:       " + dni +
                "\n   Teléfono:  " + telefono +
                "\n   Email:     " + email +
                "\n   Dirección: " + direccion;
    }

}
