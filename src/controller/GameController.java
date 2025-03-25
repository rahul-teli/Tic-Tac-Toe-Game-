package controller;

import lombok.NoArgsConstructor;
import models.Cell;
import models.Game;
import models.HumanPlayer;
import models.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@NoArgsConstructor

public class GameController {
    Game game;

    public GameController(Game game) {
        this.game = game;
    }

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

        return new Game(n, playerList);
    }
    /*
        Helps the user make next move
        1. Finds the palyer with next move
        2. calls the make move method
        3. Update the board with that move and corresponding validation
        4. Check all the winning strategies
        5. Displays the board.
     */

    public void makeNextMove(){
        //step 1 ;
        int currPlayerIndex = game.getCurrentPlayerIndex();
        Player currPlayer = game.playerList.get(currPlayerIndex);

        //step 2:
        System.out.printf("Its %s's move ", currPlayer.getName());
        System.out.println();
        Cell cell = currPlayer.makeMove();

        //Step 3 : Update the board if it fails again make the next move.
        try{
            game.getBoard().updateBoard(cell, currPlayer);
        } catch (IllegalArgumentException e){
            System.out.println("Please make valid move ");
            makeNextMove();
        }

        //Step4 : Check for winning strategies
        game.getWinningStrategies().stream().forEach()
    }
}
