/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class Eje20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizMagica= new int[3][3];
        int[] columna= new int[3];
        int[] fila= new int[3];
        int[] diagonalp= new int[3];
        int[] diagonals= new int[3];
        Scanner leer = new Scanner(System.in);
        int sumaColumna= 0;
        int sumaFila=0;
        int sumaDiagonalp=0;
         int sumaDiagonals=0;
         int contador=0;
         int testcontador=0;
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
         System.out.println("Ingrese un numero para la posición "+i+" " + j);
        int numero = leer.nextInt();
        matrizMagica [i][j] = numero;   
         }
          } 
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|"+matrizMagica[i][j]+"|");
            }
            System.out.println(" ");
          }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){diagonalp[i] = matrizMagica[i][j];}
                if ((i+j) == 2){diagonals[i] = matrizMagica[i][j];}
            }
 
        }
//System.out.println(" ---------------");
//for (int i = 0,j=0; i < 3 && j<3 ; i++, j++) {
//            System.out.println(matrizMagica[i][j]);
//        }
//        for (int i = 0, j=2; i < 3 && j>=0; i++, j--) {
//            System.out.println(matrizMagica[i][j]);
//        }
//   System.out.println(" ---------------");
            //suma   
         
        for (int i = 0; i < 3; i++) {
            sumaFila=0;
            sumaColumna=0;
                 sumaDiagonalp+=diagonalp[i];
                 sumaDiagonals+=diagonals[i];
                 System.out.println("----------");
                  System.out.println("La suma de la Diagonal Principal es  "+ sumaDiagonalp);
             System.out.println("La suma de la Diagonal Principal es "+ sumaDiagonals);
             System.out.println("---------");
            for (int j = 0; j < 3; j++) {
                sumaFila+=matrizMagica[i][j];
                sumaColumna+=matrizMagica[j][i]; }
            
            System.out.println("La suma de la fila es "+ (i +1) +" " +sumaFila);
             System.out.println("La suma de la columna es "+ (i +1)  +" "+ sumaColumna);
             System.out.println(" ");
             
             testcontador++;
           System.out.println("Contador es  "+ testcontador); 
            
              System.out.println("Contador es  "+ contador);
            }
        
         System.out.println("La suma de la Diagonal Principal es  "+ sumaDiagonalp);
             System.out.println("La suma de la Diagonal Principal es "+ sumaDiagonals);
           System.out.println("*******************************************");
              System.out.println("La suma de la fila es " +sumaFila);
             System.out.println("La suma de la columna es " + sumaColumna);
               System.out.println("*******************************");
             
           if (sumaFila == sumaColumna && (sumaFila) == sumaDiagonalp && (sumaFila )== sumaDiagonals){
                
              System.out.println(" FELICITACIONES MAGICAAA");
                 
                 }
           else{System.out.println(" NO ES MAGICAAA");}
//           System.out.println(" suma fila " + sumaFila);
//            System.out.println(" suma columna " + sumaColumna);
//             System.out.println(" suma Diagonal Principal  " + sumaDiagonalp);
//              System.out.println(" suma Diagonal Secundaria " + sumaDiagonals);

    }
    
}

//       sumaFila+=matrizMagica[i][j];
//         sumaColumna+=matrizMagica[j][i];
//         sumaDiagonalp+=diagonalp[i];
//         sumaDiagonals+=diagonalp[i];