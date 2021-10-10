package racinggame.game;

public class FixedRaceCondition implements RaceCondition {

    private final int MOVE_CONDITION = 4;
    private final int fixedNumber;

    public FixedRaceCondition(int fixedNumber) {
        this.fixedNumber = fixedNumber;
    }

    @Override
    public boolean isMovedCar() {
        if (fixedNumber >= MOVE_CONDITION) {
            return true;
        }
        return false;
    }
}
