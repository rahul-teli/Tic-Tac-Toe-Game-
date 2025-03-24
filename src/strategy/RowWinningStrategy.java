package strategy;

import models.Game;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean isWinning(Game game) {
        // TODO: Iterate over the rows and decide if the game ends
        return false;
    }
}
