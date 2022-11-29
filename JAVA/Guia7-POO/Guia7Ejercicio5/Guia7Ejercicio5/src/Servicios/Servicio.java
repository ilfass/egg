package Servicios;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarDinero(Cuenta objeto) {

        System.out.println("Ingrese la cantidad deseada a ingresar");
        objeto.setSaldo(objeto.getSaldo() + leer.nextDouble());

    }

    public void crearCuenta(Cuenta objeto) {

        System.out.println("Ingrese DNI");
        objeto.setDni(leer.next());
        objeto.setNumCuenta((int) (Math.random() * 100));
        System.out.println("Su numero de cuenta es " + objeto.getNumCuenta());

    }

    public void retirarDinero(Cuenta objeto) {
        System.out.println("Ingrese la cantidad a retirar");
        int aux = leer.nextInt();
        if (aux < objeto.getSaldo()) {
            objeto.setSaldo(objeto.getSaldo() - aux);
        } else {
            System.out.println("No se puede realizar la operacion");
        }

    }

    public void extraccionRapida(Cuenta objeto) {
        System.out.println("Ingrese la cantidad a retirar");
        int aux = leer.nextInt();
        if (aux < objeto.getSaldo() * 0.20) {
            objeto.setSaldo(objeto.getSaldo() - aux);
        } else {
            System.out.println("No se puede realizar la operacion");
        }
    }

    public void consultarSaldo(Cuenta objeto) {
        System.out.println("Su saldo es " + objeto.getSaldo());
    }

    public void consultarDatos(Cuenta objeto) {
        System.out.println(objeto.toString());
    }

}
