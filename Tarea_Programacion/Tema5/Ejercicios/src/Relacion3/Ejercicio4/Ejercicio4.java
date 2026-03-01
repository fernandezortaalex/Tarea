package Ejercicios.src.Relacion3.Ejercicio4;

import java.util.ArrayList;

import Ejercicios.src.EjercicioExamen.Animal;
import Ejercicios.src.Relacion3.Faker;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        ArrayList<Streamer> streamers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            Streamer streamer1 = new Streamer(Faker.nombre(), Faker.entero(0, 10000), Faker.categoriaTwitch(), Faker.pais());
            streamers.add(streamer1);
        }
        ArrayList<Stream> streams = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            Stream stream1 = new Stream(streamers.get(i), null, Faker., null, i, null, false)
            streamers.add(streamer1);
        }
        System.out.println(streamers);
    }
}
