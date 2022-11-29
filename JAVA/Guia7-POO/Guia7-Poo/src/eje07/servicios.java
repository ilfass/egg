/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje07;

import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class servicios {
    
    public persona crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         String sexo;
        
        System.out.println(" Ingrese el nombre ");
        String nombre = leer.next();
        System.out.println(" Ingrese la edad ");
         int edad = leer.nextInt();
       
        do{
         System.out.println(" Ingrese el sexo ");
          sexo = leer.next();
        } //while(!sexo.equalsIgnoreCase("m")||!sexo.equalsIgnoreCase("f") ||!sexo.equalsIgnoreCase("o"));
        while (!"m".equalsIgnoreCase(sexo) && !"f".equalsIgnoreCase(sexo) && !"o".equalsIgnoreCase(sexo));
        System.out.println(" Ingrese el peso ");
        double peso = leer.nextDouble();
        System.out.println(" Ingrese la altura ");
        double altura = leer.nextDouble();

        
        
        System.out.println("nombre= " + nombre + "edad "+ edad + "sexo " + sexo);
        return new persona(nombre,edad,sexo, peso, altura);
    }

    public int calcularIMC(persona nueva) {

        double imc;
       // int imcn = 0;
        // objetoPeso.getPeso()/((Math.pow(objetoAltura.getAltura(),2)));
        imc = nueva.getPeso() / (Math.pow(nueva.getAltura(), 2));
          System.out.println("el peso es  " + nueva.getPeso() + "la altura es "+nueva.getAltura() );
        System.out.println("su IMC es  " + imc);
int imcn =1;
        if (imc < 20) {
          imcn = -1;
          System.out.println(" entro en el -1");
        } else if (imc > 19 && imc < 26) {
          imcn = 0;
          System.out.println(" entro en el 0");
        } else if (imc > 25) {
         imcn = 1;
        System.out.println(" entro en el 1");
        }
        
     return imcn;

    }

    public boolean esMayorDeEdad(persona personaNueva) {
        try{
        boolean mayor = false;
        // int esMayor;
        System.out.println("edad "+ personaNueva.getEdad() );
        if (personaNueva.getEdad() > 17) {
            mayor = true;
            System.out.println(" Es mayor de edad" + mayor);
        }
        return mayor;
        }
        catch
    }

    public void resultados (persona personaNueva, resultado resultadoNuevo) {

        switch (calcularIMC(personaNueva)) {
            case -1:
                System.out.println("La persona está por debajo de su peso ideal");
                resultadoNuevo.bajoPeso++;
                break;
            case 0:
                System.out.println("La persona está en su peso ideal");
                resultadoNuevo.pesoIdeal++;
                break;
            case 1:
                System.out.println("La persona supera su peso ideal");
                resultadoNuevo.sobrePeso++;
                break;

        }
        if (esMayorDeEdad(personaNueva)) {
            System.out.println("La persona es mayor de edad");
           resultadoNuevo.mayores ++;
        } else {
            System.out.println("La persona no es mayor de edad");
            resultadoNuevo.menores ++;
        }

    }


    
    
    
}


