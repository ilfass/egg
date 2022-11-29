package ejercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Crear una clase llamada Operacion que tenga como atributos privados numero1 y
        numero2. A continuación, se deben crear los siguientes métodos:

        a) Método constructor con todos los atributos pasados por parámetro.
        b) Metodo constructor sin los atributos pasados por parámetro.
        c) Métodos get y set.
        d) Método para crearOperacion(): que le pide al usuario los dos números y los
           guarda en los atributos del objeto.
        e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
        f) Método restar(): calcular la resta de los números y devolver el resultado al main
        g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
           si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
           error. Si no, se hace la multiplicación y se devuelve el resultado al main
        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
            pasar una división por cero, el método devuelve 0 y se le informa al usuario el
            error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
            al main.
         */

        Scanner read = new Scanner(System.in);
        int option = 0;
        boolean entered = false;
        Operacion op1 = new Operacion();

        CargarNumeros crear1 = new CargarNumeros();
        Operaciones operaciones = new Operaciones();

        System.out.println("\t .:Bienvenido a la calculadora:.");

        do {

            System.out.println("\n1-Ingresar números.\n2-Sumar.\n3-Restar.\n4-Multiplicar.\n5-Dividir.\n6-Salir ");
            System.out.print("\nElija la opcion deseada: ");

            option = read.nextInt();
            switch (option) {
                case 1:
                    crear1.ingresoPrimerNumero(op1);
                    crear1.ingresoSegundoNumero(op1);
                    entered = true;
                    break;
                case 2:
                    if (entered == false) {
                        System.out.println("\nError, primero debe ingresar los números, ingrese opcion 1.");
                    } else {
                        operaciones.sumar(op1);
                    }
                    break;
                case 3:
                    if (entered == false) {
                        System.out.println("\nError, primero debe ingresar los números, ingrese opcion 1.");
                    } else {
                        operaciones.restar(op1);
                    }
                    break;
                case 4:
                    if (entered == false) {
                        System.out.println("\nError, primero debe ingresar los números, ingrese opcion 1.");
                    } else {
                        operaciones.multiplicar(op1);
                    }
                    break;
                case 5:
                    if (entered == false) {
                        System.out.println("\nError, primero debe ingresar los números, ingrese opcion 1.");
                    } else {
                        operaciones.dividir(op1);
                    }
                    break;
                case 6:
                    System.out.println("Muchas gracias por su uso.");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta (1-6)");
                    break;
            }
        } while (option != 6);
    }

}
