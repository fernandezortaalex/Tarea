// Crea una clase CuentaBancaria con atributos titular y saldo. 
// Agrega métodos depositar(cantidad) y retirar(cantidad), asegurando que el saldo no sea negativo después de un retiro.
package Ejercicios.src.Relacion1;

import java.util.Scanner;

//Creo la clase
class CuentaBancaria {
    //Atributos
    String titular;
    double saldo;
    
    //Constructor
    CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Metodo para depositar mas dinero
    double depositar(double cantidad){
        return saldo += cantidad;
    }

    //Metodo para retirar
    boolean retirar( double cantidad){
        //Si puedes retirar resta a saldo la cantidad a retirar y devuelve el booleano
        boolean puedesRetirar = true;
        if (cantidad > saldo) {
            puedesRetirar = false;
        }else{
            saldo -= cantidad;
        }
        return puedesRetirar;
    }
}
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ingresar, dineroRetirar;
        //Ingreso los datos de una cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("Alex", 1000);
        
        System.out.println("Cantidad a ingresar: ");
        ingresar = scanner.nextDouble();
        System.out.println("Cantidad a retirar: ");
        dineroRetirar = scanner.nextDouble();

        //Ingreso una cantidad extra
        cuenta1.depositar(ingresar);

        //Comparo con lo que me devuelva el booleano
        if (cuenta1.retirar(dineroRetirar)) {
            System.out.println("Puedes retirar el dinero y se queda: " + cuenta1.saldo);
        }else{
            System.out.println("No puedes retirar, tienes: " + cuenta1.saldo);
        }

        scanner.close();
    }
}
