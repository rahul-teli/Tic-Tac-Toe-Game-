package strategy;

import models.Board;
import models.Cell;
import models.Player;

public interface BotPlayingStrategy {
    Cell suggestMove(Player player, Board board);
}
