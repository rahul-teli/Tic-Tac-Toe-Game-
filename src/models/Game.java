package models;

import java.util.List;

public class Game {
    public Board board;
    public List<Player> playerList;
    int currentPlayerIndex;
    List<Cell> moves;
    GameState gameState;
}
