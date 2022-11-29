/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02;

import relationclasstask02.entity.Game;
import relationclasstask02.entity.Player;
import relationclasstask02.entity.waterPistol;
import relationclasstask02.services.gameService;
import relationclasstask02.services.playerService;
import relationclasstask02.services.waterPistolService;

/**
 *
 * @author Exequiel Hordt
 * @version 17 Oct 2022
 */
public class RelationClassTask02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables

        Game juego = new Game();
        Player jugadores = new Player();
        waterPistol pistola = new waterPistol();

        gameService gameServ = new gameService();
        playerService playerServ = new playerService();
        waterPistolService wPS = new waterPistolService();

       
      // playerServ.addPlayer();
       gameServ.fillGame(playerServ.addPlayer(), pistola);
       wPS.toString();
        wPS.fillPistol(pistola);
        wPS.wet(pistola);
        wPS.nextJet(pistola);
        wPS.showInfo(pistola);
        wPS.toString();
        playerServ.shoot(pistola);
        //Procedures
       
        gameServ.round();
    }

}
