// Crea una clase Termómetro con un atributo temperatura. 
// Agrega método convertirAFahrenheit().
package Tarea_Programacion.Tema5.Relacion1;

class Termometro {
    //Atributo
    double temperatura;

    //Constructor
    Termometro(double temperatura){
        this.temperatura = temperatura;
    }

    /**
     * Hace la operacion a Fahrenheit
     * @return devuelve la temperatura modificada
     */
    double convertirAFahrenheit(){
        temperatura = (temperatura * 1.8 + 32);
        return temperatura;
    }
    
    /**
     * Imprime un mensaje llamando directamente al objeto
     */
    @Override
    public String toString() {
        
        return "La temperatura en Fahrenheit va a ser: " + temperatura;
    }

}
public class Ejercicio5 {
    /**
     * Funcion para mostrar mensaje
     * @param num 
     */
    // static void mostrarMensaje(double num){
    //     System.out.println(Double.toString(num));
    // }
    public static void main(String[] args) {
        Termometro temperatura1 = new Termometro(5.5);
        temperatura1.convertirAFahrenheit();
        // mostrarMensaje(temperatura1.convertirAFahrenheit());
        System.out.println(temperatura1);
    }
}
