//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma


package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nro");
        int num1 = leer.nextInt();
        
          System.out.println("Ingrese otro nro");
        int num2 = leer.nextInt();
        
        int suma = (num1 + num2);
        System.out.println("El resultado de "+ num1 + " + "+ num2 +" es "+  suma);
                
    }
    
}
