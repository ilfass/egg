/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejej09;

/**
 *
 * @author fa07f
 */
public class principalMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        matematica numeros = new matematica();
        
        numeros.setNum1(Math.random()*100+1);
        System.out.println(" El num 1 es "+ numeros.getNum1() );
        numeros.setNum2(Math.random()*100+1);
         System.out.println(" El num 2 es "+ numeros.getNum2() );
        serviciosMatematicas servi = new serviciosMatematicas();
        
        double elMayor = servi.devolverMayor(numeros);
        double elMayorRedondeado= Math.round(elMayor);
        System.out.println("El mayor redondeado es "+ elMayorRedondeado );
        servi.calcularPotencia(elMayorRedondeado, numeros);
        servi.calculaRaiz(elMayorRedondeado, numeros);
    }
    
}
