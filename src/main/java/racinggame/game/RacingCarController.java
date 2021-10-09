package racinggame.game;

import nextstep.utils.Console;
import racinggame.game.domain.Round;

public class RacingCarController {

    private final String CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String PLAY_ROUND_USER_INPUT_MESSAGE = "시도할 회수는 몇회인가요?";
    private final String WRONG_INPUT_NUMBER_MESSAGE = "[ERROR]시도할 회수를 다시 입력해주세요.";

    private RacingTrack racingTrack = new RacingTrack();
    private Round round;

    public void playRacing() {
        readyStartRacing();
        inputRoundNumber();

        racingTrack.play(round);
    }

    private void readyStartRacing() {
        System.out.println(CAR_NAME_INPUT_MESSAGE);
        while (userInputCarName()) {
            System.out.println(CAR_NAME_INPUT_MESSAGE);
        }
    }

    private boolean userInputCarName() {
        String userCarNameInput = Console.readLine();
        try {
            racingTrack.readyStartingLineCars(userCarNameInput);
            return true;
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }

    private void inputRoundNumber() {
        System.out.println(PLAY_ROUND_USER_INPUT_MESSAGE);
        String userInputRound = Console.readLine();
        while (setRoundNumber(userInputRound)) {
            System.out.println(PLAY_ROUND_USER_INPUT_MESSAGE);
        }
    }

    private boolean setRoundNumber(String userInputRound) {
        try {
            int number = Integer.parseInt(userInputRound);
            round = new Round(number);
            return true;
        } catch (Exception exception) {
            System.out.println(WRONG_INPUT_NUMBER_MESSAGE);
            return false;
        }
    }
}
