
package Servicios;


public class Cuenta {
    private String dni;
    private int numCuenta;
    private double saldo;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public Cuenta(String dni, int numCuenta) {
        this.dni = dni;
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "dni=" + dni + ", numCuenta=" + numCuenta + ", saldo=" + saldo + '}';
    }
    
   
}
