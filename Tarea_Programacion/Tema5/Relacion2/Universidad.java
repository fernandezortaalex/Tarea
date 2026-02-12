package Tarea_Programacion.Tema5.Relacion2;
import java.util.ArrayList;

// Luego, crea una clase Universidad que tenga un array de estudiantes y métodos para:

//     Agregar estudiantes
//     Mostrar todos los estudiantes
//     Buscar un estudiante por su número de matrícula

public class Universidad {

    ArrayList<Estudiante> alumnado;


    public Universidad() {
        this.alumnado = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        alumnado.add(estudiante);
    }

    public String mostrarAlumnado(){
        String stringAlumnado = "";
        for (Estudiante estudiante : alumnado) {
            stringAlumnado += "--" + estudiante + "\n";
        }
        return stringAlumnado;
    }

}
