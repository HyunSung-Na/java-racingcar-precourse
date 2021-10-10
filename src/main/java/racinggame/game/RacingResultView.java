package racinggame.game;

import racinggame.game.domain.Car;

import java.util.List;

public class RacingResultView {

    private final String GAME_RESULT_MESSAGE = "실행결과";
    private final String ROUND_RESULT_MID_MESSAGE = " : ";
    private final String RACING_RESULT_MID_MESSAGE = ",";
    private final String CAR_RACING_VIEW_MESSAGE = "-";
    private final String RACING_WINNER_RESULT_MESSAGE = "최종 우승자는 %s 입니다.";

    private final StringBuilder outPutMessage = new StringBuilder();

    public void gameResultMessage() {
        System.out.println(GAME_RESULT_MESSAGE);
    }

    public void gameRoundResultMessage(List<Car> cars) {
        cars.forEach(car -> {
            outPutMessage.append(car.getName());
            outPutMessage.append(ROUND_RESULT_MID_MESSAGE);
            appendCarMoveResult(car.getDistance());
            System.out.println(outPutMessage);
            outPutMessage.delete(0, outPutMessage.length());
        });
    }

    private void appendCarMoveResult(int distance) {
        for (int index = 0; index < distance; index++) {
            outPutMessage.append(CAR_RACING_VIEW_MESSAGE);
        }
    }

    public void gameWinnerResultMessage(List<Car> cars) {
        addWinnerCarMessage(cars);
        String resultMessage = String.format(RACING_WINNER_RESULT_MESSAGE, outPutMessage);
        System.out.println(resultMessage);
    }

    private void addWinnerCarMessage(List<Car> cars) {
        if (cars.size() == 1) {
            Car winnerCar = cars.get(0);
            outPutMessage.append(winnerCar.getName());
            return;
        }
        jointWinCarMessage(cars);
    }

    private void jointWinCarMessage(List<Car> cars) {
        cars.forEach(car -> {
            outPutMessage.append(car.getName());
            outPutMessage.append(RACING_RESULT_MID_MESSAGE);
        });
        outPutMessage.deleteCharAt(outPutMessage.length() - 1);
    }
}
