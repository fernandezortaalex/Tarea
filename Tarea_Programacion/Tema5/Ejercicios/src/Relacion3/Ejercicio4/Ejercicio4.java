package Ejercicios.src.Relacion3.Ejercicio4;

import java.util.ArrayList;

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
            Stream stream1 = new Stream(streamers.get(i), Faker.loremCorto(), Faker.entero(3, 100), Faker.categoriaTwitch(), Faker.entero(5, 40), Faker.fechaYYYYMMDD(2004, 2026));
            streams.add(stream1);
        }
        System.out.println(streams);

    }
}
