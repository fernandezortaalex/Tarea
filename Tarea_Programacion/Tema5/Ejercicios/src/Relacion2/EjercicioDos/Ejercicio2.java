package Ejercicios.src.Relacion2.EjercicioDos;

import Ejercicios.src.Relacion2.Faker;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Creo un nuevo objeto libro
        Libro libro1 = new Libro("Stem-123", "svdfv", "Alex", "adadsad", true);
        System.out.println(libro1);

        //Llama al constructor de Biblioteca para iniciar el objeto llamado bibliotecaAyamonte
        Biblioteca bibliotecaAyamonte = new Biblioteca();
        bibliotecaAyamonte.agregarLibro(libro1);
        System.out.println(bibliotecaAyamonte);
        
        //Creo los 100 libros
        Biblioteca bibliotecaGranada = new Biblioteca();
        Libro aleatorio = new Libro();
        final int NUMEROLIBROS = 100;   
        for (int i = 0; i < NUMEROLIBROS; i++) {
            aleatorio = new Libro("Stem-" + i, Faker.loremCorto(), Faker.nombre(), Faker.loremLargo(), Faker.booleano());
            bibliotecaGranada.agregarLibro(aleatorio);
        }
        System.out.println(bibliotecaGranada);
    }


}
