/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fa07f
 */
public class ServiciosBaraja {

    ArrayList<baraja> barajas = new ArrayList<>();
    ArrayList<baraja> descartadas = new ArrayList<>();
    Scanner leer = new Scanner(System.in);
    
    public void crearBaraja() {

        int cont = 12;
        for (int i = 1; i <= cont; i++) {
            //int aleatorio = (int) (Math.random()*11+1);  
            if (i != 8 && i != 9) {
                barajas.add(new baraja(i, "basto"));
                barajas.add(new baraja(i, "copa"));
                barajas.add(new baraja(i, "oro"));
                barajas.add(new baraja(i, "espada"));
                // cont--;
            }
        }
//            for (baraja baraja1 : barajas) {
//                System.out.println(baraja1);
//        }
    }

    public void barajar() {
        Collections.shuffle(barajas);
        for (baraja baraja1 : barajas) {
            System.out.println(baraja1);
        }
    }

    public void siguienteCarta() {
        descartadas.add(barajas.remove(0));
        for (baraja aux : descartadas) {
            System.out.println("las descartadas "+aux);
        }
    }
public void cartasDisponibles(){
    System.out.println("Se pueden repartir " + barajas.size() + " cartas");
}

public void darCartas(){

    System.out.println("Cuantas cartas quieres??");
int eleccion = leer.nextByte();
// System.out.println("descartadas hay "+ descartadas.size());
//    System.out.println("La suma es "+ (eleccion + descartadas.size()));
if ((eleccion + descartadas.size()) < 40){
  
    for (int i = 0; i < eleccion-1; i++) {
      System.out.println(barajas.get(i).toString());
      descartadas.add(barajas.remove(i));
    }
    for (baraja baraja1 : descartadas) {
        System.out.println(" las barajas " + baraja1);
    }
}else
{System.out.println("Estas eligiendo más cartas de las que hay, porque quedan "+ barajas.size());}


}
public void cartasMonton(){
if (barajas.isEmpty()){
    System.out.println("No quedaron cartas");
}
else{
    for (baraja aux : descartadas) {
        System.out.println("las descartadas son "+ aux);
    }
 {
        
    }
}
}


//       do {
//            System.out.println("-- MENU --");
//            System.out.println("1- Barajar");
//            System.out.println("2- Siguiente carta");
//            System.out.println("3- Cartas Disponibles");
//            System.out.println("4- Dar cartas");
//            System.out.println("5- Cartas monton");
//            System.out.println("6- Mostrar baraja");
//            System.out.println("7- Salir");
//            option = scanner.nextInt();
//
//            switch (option) {
//                case 1:
//                    deck.shuffle();
//                    break;
//                case 2:
//                    System.out.println(deck.nextCard().toString());
//                    break;
//                case 3:
//                    System.out.println(deck.availableCards());
//                    break;
//                case 4:
//                    System.out.print("Ingrese cantidad de cartas: ");
//                    int numberOfCards = scanner.nextInt();
//                    for (Card card : deck.dealCards(numberOfCards)) {
//                        System.out.println(card.toString());
//                    }
//                    break;
//                case 5:
//                    for (Card card : deck.getDiscardDeck()) {
//                        System.out.println(card.toString());
//                    }
//                    break;
//                case 6:
//                    for (Card card : deck.getDeck()) {
//                        System.out.println(card.toString());
//                    }
//                    break;
//            }
//        } while (option != 7);

}
