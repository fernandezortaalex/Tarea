import java.util.ArrayList;

public class Director extends PersonaAgrupacion implements GestionHumana{
    private String especialidad;
    private int maximoMusicos;
    private ArrayList<PersonaAgrupacion> musicosAsignados;
    private double plusDireccion;

    public Director(String nombre, int edad, int antiguedad, String especialidad, int maximoMusicos,
            ArrayList<PersonaAgrupacion> musicosAsignados, double plusDireccion) {
        super(nombre, edad, antiguedad);
        this.especialidad = especialidad;
        this.maximoMusicos = maximoMusicos;
        this.musicosAsignados = musicosAsignados;
        this.plusDireccion = plusDireccion;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getMaximoMusicos() {
        return maximoMusicos;
    }
    public void setMaximoMusicos(int maximoMusicos) {
        this.maximoMusicos = maximoMusicos;
    }
    public ArrayList<PersonaAgrupacion> getMusicosAsignados() {
        return musicosAsignados;
    }
    public void setMusicosAsignados(ArrayList<PersonaAgrupacion> musicosAsignados) {
        this.musicosAsignados = musicosAsignados;
    }
    public double getPlusDireccion() {
        return plusDireccion;
    }
    public void setPlusDireccion(double plusDireccion) {
        this.plusDireccion = plusDireccion;
    }
    
    @Override
    public double calcularAportacion() {
        return getAntiguedad() * 10 + plusDireccion + (musicosAsignados.size() * 5);
        
    }

    @Override
    public boolean puedeParticipar() {
        boolean resultado = false;
        if (getEdad() >= 18) {
            resultado = true;
        }
        return resultado;
    }

    @Override
    public boolean asignarMusico(PersonaAgrupacion persona) {
        boolean resultado = false;
        boolean encontrado = false;
        if (persona != null) {
            if (musicosAsignados.size() < maximoMusicos) {
                
                for (int i = 0; i < musicosAsignados.size(); i++) {
                    //Si el nombre es igual que el de alguno que este en la lista 
                    if (musicosAsignados.get(i).getNombre().equalsIgnoreCase(persona.getNombre())) {
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    musicosAsignados.add(persona);
                    resultado = true;
                }
            }
        }
        return resultado;
    }

    @Override
    public boolean expulsarMusico(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < musicosAsignados.size() && !eliminado; i++) {
            if (musicosAsignados.get(i).getNombre().equalsIgnoreCase(nombre)) {
                musicosAsignados.remove(musicosAsignados.get(i));
                eliminado = true;
            }
        }
        return eliminado;
    }

    public int contarMusicosAsignados(){
        return musicosAsignados.size();
    }
    
    public double calcularValorTotalAportacionMusicos(){
        double suma = 0.0;
        for (PersonaAgrupacion persona : musicosAsignados) {
            suma += persona.calcularAportacion();
        }
        return suma;
    }



    
}
