/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_eje1;

/**
 *
 * @author fa07f
 */
public class mainEje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
perro perro1 = new perro("lolo",4,"caniche");
perro perro2 = new perro();
        persona persona1 = new persona("fabian", 38, 3055252, perro1);
        persona persona2 = new persona();   

        
        System.out.println(persona1.toString());;
    }
    
}
