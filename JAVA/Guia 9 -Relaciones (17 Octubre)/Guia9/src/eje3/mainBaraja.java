/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

/**
 *
 * @author fa07f
 */
public class mainBaraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        baraja mazo = new baraja();
        ServiciosBaraja cartas =new ServiciosBaraja();
        cartas.crearBaraja();
      cartas.barajar();
        cartas.siguienteCarta();
        cartas.cartasDisponibles();
        cartas.darCartas();
     cartas.cartasMonton();
    }
    
}
