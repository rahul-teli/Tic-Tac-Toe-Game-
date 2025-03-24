package strategy;

import models.Game;

public interface WinningStrategy {

    boolean isWinning(Game game);
}
