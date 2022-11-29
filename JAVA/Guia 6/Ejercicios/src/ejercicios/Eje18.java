/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).
package ejercicios;

/**
 *
 * @author fa07f
 */
public class Eje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][]matriz = new int [4][4];
         int [][]matrizCopia = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int) (Math.random()* 100 + 1);
                System.out.print("[ " + matriz[i][j] + " ]");   
            }
         System.out.println(" ");
        }
          System.out.println("------------------ ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               // matrizCopia[j][i]=matriz[i][j];
                System.out.print("[ " + matriz[j][i] + " ]");   
            }
         System.out.println(" ");
        }  
        
        
    }
    
}