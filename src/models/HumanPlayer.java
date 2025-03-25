package models;

import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, Character symbol, int id) {
        super(name, symbol, id);
    }

    @Override
    public Cell makeMove() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your next move? ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        return new Cell(row, col);
    }
}
