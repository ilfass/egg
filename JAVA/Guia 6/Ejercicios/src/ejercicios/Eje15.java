/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
////muestre por pantalla en orden descendente.
package ejercicios;

/**
 *
 * @author fa07f
 */
public class Eje15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] primerosnros = new int[100];
        int n= 100;
        for (int i = 0; i < n; i++) {
            primerosnros[i]= 100 -i;
             System.out.print(primerosnros[i] +" ");
        }
        
//        for (int i = 0; i < n; i++) {
//           
//        }
    }
    
}
