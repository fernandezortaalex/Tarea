// Crea una clase Auto con atributos marca, modelo y velocidadActual. 
// Agrega métodos acelerar(cantidad) y frenar(cantidad) que aumenten o reduzcan la velocidad actual.
package Tarea_Programacion.Tema5.Relacion1;


class auto {
    //Atributos
    String marca;
    String modelo;
    int velocidadActual;
    
    //Constructor
    auto(String marca, String modelo, int velocidadActual){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    //Metodo para acelerar
    int acelerar(int cantidad){
        velocidadActual += cantidad;
        return velocidadActual;
    }

    /**
     * Reduce la velocidad del vehiculo
     * @param cantidad cuanta velocidad quieres reducir
     * @return el calculo con la velocidad reducida
     */
    int frenar(int cantidad){
        if (cantidad <= velocidadActual) {
            velocidadActual -= cantidad;
            
        }else{
            velocidadActual = 0;
        }
        return velocidadActual;
    }
}
public class Ejercicio4 {
    public static void main(String[] args) {
        int cantidadFrenar;

        auto auto1 = new auto("seat", "cordoba", 100);
        auto1.acelerar(20);
        System.out.println(auto1.velocidadActual);

        cantidadFrenar = auto1.frenar(5);
        //Compara con lo que devuelve el metodo de frenar
        if (cantidadFrenar != 0) {
            System.out.println(auto1.velocidadActual);
            
        }else{
            System.out.println("No puedes frenar mas de la velocidad actual");
        }
    }
}
