/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.entity;

import java.util.ArrayList;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class Game {

    private ArrayList<Player> players;
    private waterPistol wP;

    public Game() {
    }

    public Game(ArrayList<Player> players, waterPistol wP) {
        this.players = players;
        this.wP = wP;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public waterPistol getwP() {
        return wP;
    }

    public void setwP(waterPistol wP) {
        this.wP = wP;
    }

    

}
