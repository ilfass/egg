/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class eje19_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [][]matriz = new int [3][3];
        int [][]matrizCopia = new int [3][3];
        boolean esAntisimetrica = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero");
                int numero = leer.nextInt();       
                matriz[i][j]=numero;
            }
        }

        
        
        System.out.println("MATRIZ ORIGINAL"); 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {   
                System.out.print("[ " + matriz[i][j] + " ]"); }
         System.out.println(" ");
        }
          System.out.println("------------------ ");
          
          
          
        System.out.println("MATRIZ TRANS");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizCopia[i][j]=matriz[j][i] * -1;
          System.out.print("[ " + matrizCopia[i][j] + " ]"); }
              System.out.println(" ");      
            }
       
        
         
          
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
      if ((matriz[i][j]) != (matrizCopia[i][j]*1) ){
          esAntisimetrica = false;}  
    }
        } 
        
        System.out.println(esAntisimetrica); 
    }    }

