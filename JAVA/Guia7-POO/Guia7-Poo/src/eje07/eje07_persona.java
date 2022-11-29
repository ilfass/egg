/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje07;

/**
 *
 * @author fa07f
 */
public class eje07_persona {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        servicios servi = new servicios();
       resultado resul = new resultado();
      
      persona persona1 =servi.crearPersona();
        persona persona2 = servi.crearPersona();
       persona persona3 = servi.crearPersona();
     //   persona persona4= servi.crearPersona();
        
    
       servi.calcularIMC(persona1);
      servi.esMayorDeEdad(persona1);
      servi.resultados(persona1, resul);
    //  servi.crearPersona();
      servi.calcularIMC(persona2);
      servi.esMayorDeEdad(persona2);
      servi.resultados(persona2, resul);
//     // servi.crearPersona();
//      servi.calcularIMC(persona3);
//      servi.esMayorDeEdad(persona3);
//        servi.resultados(persona3, resul);
//    // servi.crearPersona();
//      servi.calcularIMC(persona4);
//      servi.esMayorDeEdad(persona4);
//        servi.resultados(persona4, resul);
//      
        System.out.println("La cantidad de mayores en porcentaje es " + (resul.mayores * 100) / 4);
        System.out.println("La cantidad de menores en porcentaje es " + (resul.menores * 100) / 4);
        System.out.println("La cantidad de procentaje bajo peso es " + (resul.bajoPeso * 100) / 4);
        System.out.println("La cantidad de procentaje alto peso es " + (resul.sobrePeso * 100) / 4);
        System.out.println("La cantidad de procentaje normal peso es " + (resul.pesoIdeal * 100) / 4);

      
      
//        
//       servi.crearPersona(persona2);
//       servi.calcularIMC(persona2,persona2);
//       servi.esMayorDeEdad(persona2);
//       servi.crearPersona(persona3);
//       servi.calcularIMC(persona3,persona3);
//       servi.esMayorDeEdad(persona3);
//       servi.crearPersona(persona4);
//       servi.calcularIMC(persona4,persona4);
//       servi.esMayorDeEdad(persona4);


    }

}
