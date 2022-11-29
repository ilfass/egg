/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10herencia.Ejemplos;

import java.util.ArrayList;

/**
 *
 * @author fa07f
 */
public class mainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<animal>animales;
        
      animales = new ArrayList<>();
        
        animal a = new animal();
        animal b = new perro();
        animal c = new gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        
        for (animal aux : animales) {
          a.hacerRuido();
          b.hacerRuido();
          c.hacerRuido();
            
        }
    }
    
    
    
}
