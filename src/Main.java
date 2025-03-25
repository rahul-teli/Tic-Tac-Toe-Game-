import controller.GameController;
import models.Board;
import models.Game;
import models.GameState;

public class Main {
    public static void main(String[] args) {

    Game game = GameController.initialseGame();
    GameController gc = new GameController(game)   ;

    while(game.getGameState().equals(GameState.IN_PROGRESS)){
        game.getBoard().displayBoard();
        //prints net player move
        //asks user for input
        gc.makeNextMove();
    }
    }
}