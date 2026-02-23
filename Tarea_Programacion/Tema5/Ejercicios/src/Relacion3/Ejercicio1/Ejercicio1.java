package Ejercicios.src.Relacion3.Ejercicio1;


public class Ejercicio1 {
    public static void main(String[] args) {
        
        Puerto puerto1 = new Puerto("Alex", "Powrtugla", 2, "234234");
        Embarcacion embarcacion1 = new Embarcacion("fwefsefd", "sbnfkjbns", 6, "yate", "Alex", 1980, 2423);
        Embarcacion embarcacion2 = new Embarcacion("fwfefsefd", "sbnfkjbns", 6, "yate", "Alex", 1980, 2423);
        Amarre amarre1 = new Amarre(50.0, "normal");
        Amarre amarre2 = new Amarre(20.0, "normal");
        puerto1.registrarEmbarcacion(embarcacion1);
        puerto1.registrarEmbarcacion(embarcacion2);
        puerto1.altaAmarre(amarre1);
        puerto1.altaAmarre(amarre2);

        

        System.out.println(puerto1);
    }
}
