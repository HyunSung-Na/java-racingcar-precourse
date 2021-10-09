package racinggame.game;

import racinggame.game.domain.Cars;
import racinggame.game.domain.Round;

public class RacingTrack {

    private final String WRONG_INPUT_CAR_NAME_LENGTH_MESSAGE = "[ERROR] 자동차는 2대 이상 참가해야합니다.";
    private final int MIN_CAR_LENGTH = 2;

    private final Cars cars = new Cars();

    public void readyStartingLineCars(String userCarNameInput) {
        String[] carNames = userCarNameInput.split(",");
        validateUserCarNameInput(carNames);

        cars.setCars(carNames);
    }

    private void validateUserCarNameInput(String[] splitUserInput) {
        if (splitUserInput.length < MIN_CAR_LENGTH) {
            throw new IllegalArgumentException(WRONG_INPUT_CAR_NAME_LENGTH_MESSAGE);
        }
    }

    public void play(Round round) {
        for (int roundNumber = 0; roundNumber < round.getRound(); roundNumber++) {
            cars.racing();
        }
    }
}
