/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationclasstask02.services;

import java.util.ArrayList;
import java.util.Scanner;
import relationclasstask02.entity.Player;
import relationclasstask02.entity.waterPistol;

/**
 *
 * @author Exequiel Hordt
 * @version 18 Oct 2022
 */
public class playerService {

    private waterPistolService wPS = new waterPistolService();
    private Player player = new Player();

    public ArrayList<Player> addPlayer() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int amountPlayer;
        ArrayList<Player> players = new ArrayList<>();
        System.out.print("Ingrese el numero de jugadores: ");
        amountPlayer = read.nextInt();
        if (amountPlayer > 6) {
            amountPlayer = 6;
        }
        for (int i = 0; i < amountPlayer; i++) {
            player = new Player();
            System.out.print("Ingrese id: ");
            player.setId(read.nextInt());
            System.out.print("Nombre: ");
            player.setName(read.next());
            players.add(player);
        }

        return players;
    }

    /**
     *
     * @param wP
     * @return
     */
    public boolean shoot(waterPistol wP) {
        if (wPS.wet(wP)) {
            System.out.println("Esta re mojado");
            player.setWet(true);
        } else {
                System.out.println("Sigue participando");
            player.setWet(false);
            wPS.nextJet(wP);
        }
        return player.isWet();
    }

}
