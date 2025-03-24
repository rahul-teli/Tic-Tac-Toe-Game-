package controller;

import models.Game;
import models.HumanPlayer;
import models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public static Game initialseGame(){
        System.out.println("Enter the board size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Player> playerList = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Enter the name and symbol of the player");
            String name = sc.next();
            String symbol = sc.next();
            //TODO : Handle bot player as input
            playerList.add(new HumanPlayer(name, symbol.charAt(0), i+1));

        }

        return new Game(n, playerList){

        };

    }
}
