package Ejercicios.src.Relacion2.EjercicioUno;

import java.util.ArrayList;

public class Universidad {
    /**
     * Clase estudiante con el nombre alumnado
     */
    ArrayList<Estudiante> alumnado;

    /**
     * Inicio el array
     */
    public Universidad(){
        this.alumnado = new ArrayList<>();
    }

    public Universidad(ArrayList<Estudiante> alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * A la clase estudiante le añado el alumno completo
     * @param alumno
     */
    public void aniadirAlumno(Estudiante alumno){
        alumnado.add(alumno);
    }

    public String mostrarEstudiantes(){
        String mensaje = "";
        for (int i = 0; i < alumnado.size(); i++) {
            
        }
        return mensaje;
    }
}
