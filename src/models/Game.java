package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    public Board board;
    public List<Player> playerList;
    int currentPlayerIndex;
    List<Cell> moves;
    GameState gameState;
}
