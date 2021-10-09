package racinggame.game;

import racinggame.game.domain.Car;
import racinggame.game.domain.Cars;
import racinggame.game.domain.Round;

import java.util.ArrayList;
import java.util.List;

public class RacingTrack {

    private final String WRONG_INPUT_CAR_NAME_LENGTH_MESSAGE = "[ERROR] 자동차는 2대 이상 참가해야합니다.";
    private final int MIN_CAR_LENGTH = 2;

    private final Cars cars = new Cars();
    private final RacingResultView racingResultView = GameFactory.racingResultView();

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
        racingResultView.gameResultMessage();

        for (int roundNumber = 0; roundNumber < round.getRound(); roundNumber++) {
            cars.racing();
            racingResultView.gameRoundResultMessage(cars.getCars());
            System.out.println();
        }
        racingResultView.gameWinnerResultMessage(findWinnerCars());
    }

    private List<Car> findWinnerCars() {
        int maxDistance = cars.findMaxDistance();
        ArrayList<Car> winnerCars = new ArrayList<>();

        for (Car car : cars.getCars()) {
            if (car.getDistance() == maxDistance) {
                winnerCars.add(car);
            }
        }
        return winnerCars;
    }
}
