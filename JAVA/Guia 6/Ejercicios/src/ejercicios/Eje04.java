/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los grados a convertir");
        
        int degree = leer.nextInt();
        
        int Fahrenheit = 32 + (9 * degree / 5);
        
        System.out.println(" This " + degree + " centiger degree is equivalent to " + Fahrenheit + " Fahrenheit" );
    }
    
}
