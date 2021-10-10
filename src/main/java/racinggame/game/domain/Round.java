package racinggame.game.domain;

public class Round {

    private final String WRONG_INPUT_MIN_ROUND_MESSAGE = "[ERROR]시도할 회수는 1 이상 입력해주세요.";
    private final int MIN_ROUND_NUMBER = 1;

    private final int round;

    public Round(int round) {
        validateRound(round);
        this.round = round;
    }

    private void validateRound(int round) {
        if (round < MIN_ROUND_NUMBER) {
            System.out.println(WRONG_INPUT_MIN_ROUND_MESSAGE);
            throw new IllegalArgumentException();
        }
    }

    public int getRound() {
        return round;
    }
}
