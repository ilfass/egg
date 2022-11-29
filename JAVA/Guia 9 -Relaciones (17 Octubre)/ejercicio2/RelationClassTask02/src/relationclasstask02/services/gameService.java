/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.services;

import java.util.ArrayList;
import relationclasstask02.entity.Game;
import relationclasstask02.entity.Player;
import relationclasstask02.entity.waterPistol;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class gameService {

  Game juego = new Game();
    Player jugadores = new Player();
     playerService pS = new playerService();
   // waterPistolService wPS = new waterPistolService();

    public void fillGame(ArrayList<Player> players, waterPistol wP) {
       juego.setPlayers(players);
        juego.setwP(wP);
    }

    public void round() {
        for (Player player : juego.getPlayers()) {
            pS.shoot(juego.getwP());
            if (player.isWet()) {
                System.out.println("The player " + player.getName() + " is wet");
                break;
            }
        }
    }
}
