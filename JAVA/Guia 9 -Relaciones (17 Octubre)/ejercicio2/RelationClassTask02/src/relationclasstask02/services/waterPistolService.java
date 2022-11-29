/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.services;

import java.util.Objects;
//import relationclasstask02.entity.Game;
import relationclasstask02.entity.waterPistol;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class waterPistolService {

    //private Game juego = new Game();
   // private waterPistol waterP;

    public void fillPistol(waterPistol waterP) {
        
        waterP.setActualPosition((int) (Math.random() * 6) + 1);
        waterP.setWaterPosition((int) (Math.random() * 6) + 1);
     
    }

    public boolean wet(waterPistol waterP) {
        System.out.println(" la posicion actual es : "+ waterP.getActualPosition());
        System.out.println(" la posicion del agua es : "+ waterP.getWaterPosition());
       return Objects.equals(waterP.getActualPosition(), waterP.getWaterPosition());
        
    }

    public void nextJet(waterPistol waterP) {
        if (waterP.getActualPosition() < 6) {
            waterP.setActualPosition(waterP.getActualPosition() + 1);
        } else {
            waterP.setActualPosition(1);
        }
    }

    public void showInfo(waterPistol waterP) {
        System.out.println(waterP);
    }
}
