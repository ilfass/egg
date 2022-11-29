package ejercicio_5;

public class CuentaBancaria {
    private int numeroDeCuenta;
    private long DNI;
    private double saldoActual;

//Constructor por defecto

    public CuentaBancaria() {
    }

//Constructor con DNI, saldo, número de cuenta e interés.    
    public CuentaBancaria(int numeroDeCuenta, long DNI, int saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

// Getters and Setters    
    
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "-----Datos de su cuenta-----\n-Su numero de cuenta bancaria es: " + numeroDeCuenta + "\n-Su numero de DNI es: " + DNI + "\n-Su saldo actual es: $" + saldoActual;
    }
    
    
}
