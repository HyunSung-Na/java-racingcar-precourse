package racinggame.game;

import nextstep.utils.Randoms;

public class RandomRaceCondition implements RaceCondition {
    private final int RANDOM_MIN_NUMBER = 0;
    private final int RANDOM_MAX_NUMBER = 9;
    private final int MOVE_CONDITION = 4;

    @Override
    public boolean isMovedCar() {
        int randomNumber = Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER);

        if (randomNumber >= MOVE_CONDITION) {
            return true;
        }
        return false;
    }
}
