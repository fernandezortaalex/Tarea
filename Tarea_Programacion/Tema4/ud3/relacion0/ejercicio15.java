// Crea una función llamada filtrarNumerosMayores que reciba un array de números y un valor, y devuelva un nuevo array con los números mayores que el valor dado.
package Tarea_Programacion.Tema4.ud3.relacion0;

import java.util.ArrayList;

public class ejercicio15 {
    /**
     * 
     * @param array Array donde se guardan los valores
     * @param cantidad Cantidad de numeros que se guardaran en el array
     * @param valorMinimo numero minimo que aparecera
     * @param valorMaximo numero maximo que aparecera
     */
    public static void rellenarArrayAleatorio(ArrayList<Integer>array, int cantidad, int valorMinimo, int valorMaximo) {
        array.clear();
        int numeroAletorio;
        //Comparar los valores introducidos.
        if (valorMinimo > valorMaximo) {
            imprimirMensaje("El valor minimo es mas grande que el maximo");
        }
        //Si la cantidad de numeros a introducir en el array es mayor al valor maximo - minimo incluyendo ambos.
        if (cantidad > (valorMaximo - valorMinimo) + 1) {
            imprimirMensaje("La cantidad de numeros que quieres introducir en el array es demasiado grande.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                numeroAletorio = (int) (Math.random() * (valorMaximo - valorMinimo + 1)) + valorMinimo;
                //Comprobar que el numero no ha sido introducido
                while (array.contains(numeroAletorio)) {
                    numeroAletorio = (int) (Math.random() * (valorMaximo - valorMinimo + 1)) + valorMinimo;
                }
                array.add(numeroAletorio);
            }
        }
    }
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumeros= new ArrayList<>();
        rellenarArrayAleatorio(arrayNumeros, 10, 1, 10);
        // System.out.println(arrayNumeros);
    }

}
