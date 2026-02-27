package Ejercicios.src.Relacion3.EjercicioMaestro;

import java.util.ArrayList;

import Ejercicios.src.Relacion3.Faker;


public class Ejercicio1 {

    public static void main(String[] args) {

        Embarcacion barco1 = new Embarcacion("Barco1", 10, "Velero");
        Embarcacion barco2 = new Embarcacion("Barco2", 10, "Velero");
        Amarre amarre1 = new Amarre(5, "Normal");
        System.out.println(amarre1);
        Amarre amarre2 = new Amarre(10, "Normal");
        System.out.println(amarre2);

        Puerto banus = new Puerto("Malaga", 30, "666666666");
        Puerto motril = new Puerto("Motril", 30, "666666666");
        banus.registrarEmbarcacion(barco1);
        banus.altaAmarre(amarre1);

        Embarcacion barco3;
        for (int i = 0; i < 20; i++) {
            barco3 = new Embarcacion(Faker.nombre(), Faker.entero(1, 30), Faker.tipoEmbarcacion());
            banus.registrarEmbarcacion(barco3);
        }

        //Crea un tipo de amarre
        Amarre amarrePuerto;
        for (int i = 0; i < 30; i++) {
            amarrePuerto = new Amarre(Faker.longitudMaximaAmarre(), Faker.tipoAmarre());
            //Llama al metodo con los parametros del amarre creado
            banus.altaAmarre(amarrePuerto);
        }

        //Crea un array booleano al que llamas a la funcion de un puerto
        ArrayList<Boolean> asignarBarco0Amarre0 = banus.asignarAmarre("EMB-0", 0);
        if (asignarBarco0Amarre0.get(0)) {
            System.out.println("Barco amarrado con exito");
        } else if (!asignarBarco0Amarre0.get(1)) {
            System.out.println("Ya está en una plaza amarrado");
        } else if (!asignarBarco0Amarre0.get(2)) {
            System.out.println("El amarre está ocupado");
        } else if (!asignarBarco0Amarre0.get(3)) {
            System.out.println("El barco no cabe en el amarre");
        }

    }
}
