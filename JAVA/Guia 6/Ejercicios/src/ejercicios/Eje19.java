/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*

 */
package ejercicios;
import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        boolean resultado = true;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Ingrese un valor [" + i + "][" + j + "]");
                matrizA[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                
                matrizB[j][i] = matrizA[i][j];
            }
        }
        
        System.out.println("Matriz original: ");
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
         System.out.println("Matriz transpuesta: ");
         
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if( (matrizB[i][j] * -1) != matrizA[i][j]){
                    resultado = false;
                }
            }
            System.out.println(" ");
        }
        
        System.out.println(resultado);
        
    }
    
}

