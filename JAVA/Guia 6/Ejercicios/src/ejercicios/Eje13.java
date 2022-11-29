/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//* *
//* *
//* * * *
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos");
        int n= leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");}
           System.out.println(" ");
           
           
        for (int x = 0; x < n-2; x++) {
           System.out.print("*");

           
         for (int j = 0; j < n-2; j++) {
          
                 System.out.print(" "); 
         }
      //  }
        System.out.println("*");
        }
        
         for (int i = 0; i < n; i++) {
            System.out.print("*");}
    }
    
}
