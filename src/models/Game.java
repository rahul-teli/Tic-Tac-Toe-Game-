package models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Game {
    public Board board;
    public List<Player> playerList;
    int currentPlayerIndex;
    List<Cell> moves;
    GameState gameState;

    public Game(int n, List<Player> playerList){
        this.board = new Board(n);
        this.playerList = playerList;
        this.currentPlayerIndex =0;
        this.moves = new ArrayList<>();
        this.gameState = GameState.INIT;
    }
}
