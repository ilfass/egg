/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).
package ejercicios;

/**
 *
 * @author fa07f
 */
public class Eje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unaCifras=0; 
        int dosCifras=0;
        int tresCifras=0;
        int cuatroCifras=0;
        int cincoCifras=0;
         int n= 1000;
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()* 100000 + 1);
            System.out.print(vector[i]+" ");
            
            if (vector[i]<10){
            unaCifras++;
            }else if(vector[i]<100){
                 dosCifras++;}
                else if(vector[i]<1000){
                tresCifras++;}
                else if (vector[i]<10000){
            cuatroCifras++;}
             else if (vector[i]<100000){
            cincoCifras++;}
            }
        System.out.println(" ");
        System.out.println("De una cifra " + unaCifras);
        System.out.println("De dos cifras " + dosCifras);
        System.out.println("De tres cifras " + tresCifras);
        System.out.println("De cuatro cifras " + cuatroCifras);
        System.out.println("De una cinco cifras " + cincoCifras);
    }
    
}
