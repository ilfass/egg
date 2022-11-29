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
public class serviciosMatematicas {
 
    public double devolverMayor(matematica num){
        double mayor;
        if (num.getNum1()>num.getNum2()){
        mayor =num.getNum1();
        num.setNum2(Math.round(num.getNum2()));
            System.out.println("vamos a ver el redondeo del menor "+ num.getNum2());
        }else{  mayor =num.getNum2();
        num.setNum1(Math.round(num.getNum1()));
            System.out.println("vamos a ver el redondeo del menor "+ num.getNum1());
        
        }
         System.out.println(" El mayor es: " + mayor);
        return mayor;
    }
    //double numMayorRedondeado = devolverMayor(matematica num);
    
    public double calcularPotencia(double mayor, matematica menor){
    double elevado;
        if (mayor == Math.round(menor.getNum1())){
        elevado = Math.pow(mayor, menor.getNum2());
        }else{
        elevado = Math.pow(mayor, menor.getNum1());
        }
       System.out.println("El resultado de la elecación es " + elevado);
        return elevado;
       
    }
    
    public void calculaRaiz(double mayor, matematica menor){
    double valorAbsoluto;
        if (mayor == Math.round(menor.getNum1())){
            valorAbsoluto= Math.abs(menor.getNum2());
        double raiz = Math.sqrt(valorAbsoluto);
        }else{
          valorAbsoluto= Math.abs(menor.getNum1());
        double raiz = Math.sqrt(valorAbsoluto);
        }
        System.out.println("La raiz del menor es: "+ valorAbsoluto);
    }
}
