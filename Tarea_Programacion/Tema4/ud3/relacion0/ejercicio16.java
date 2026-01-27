// Crea una función llamada verificarNumeroEnArray que reciba un número y un array, y devuelva true si el número está presente en el array o false si no lo está.
package Tarea_Programacion.Tema4.ud3.relacion0;

import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio16 {
    /**
     * 
     * @param numero numero a verificar
     * @param array array donde verificar el numero
     * @return 
     */
    public static boolean verificarNumeroEnArray(int numero, ArrayList<Integer>array) {
        boolean duplicado = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == numero) {
                duplicado = true;
            }
        }
        if (!duplicado) {
            imprimirMensaje("El numero no se encuentra en el array");
        } else {
            imprimirMensaje("El numero se encuentra en el array");
        }
        return duplicado;
    }
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros= new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        verificarNumeroEnArray(4, listaNumeros);
    }
}
