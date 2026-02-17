public class CuentaBancaria {

    private final Usuario titular;
    private double saldo;

    public CuentaBancaria(Usuario titular, double saldoInicial) {
        if (titular == null) {
            throw new IllegalArgumentException("El titular no puede ser null");
        }

        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }

        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public Usuario getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }

        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }

        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        saldo -= cantidad;
    }
}