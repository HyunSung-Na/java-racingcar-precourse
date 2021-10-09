package racinggame;

import racinggame.game.GameFactory;
import racinggame.game.RacingCarController;

public class Application {
    public static void main(String[] args) {
        RacingCarController racingCarController = GameFactory.racingCarController();

        racingCarController.playRacing();
    }
}
