package Ejercicios.src.Relacion2.EjercicioUno;

import Ejercicios.src.Relacion2.Faker;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Estudiante alumno1 = new Estudiante("Alex", 4, "Stem1234");
        Estudiante alumno2 = new Estudiante(Faker.nombre(), 54, "Stem1234");

        System.out.println(alumno2);
    }
}
