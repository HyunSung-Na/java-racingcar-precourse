package racinggame.game.domain;

import racinggame.game.GameFactory;
import racinggame.game.RaceCondition;

public class Car {

    private final Name name;
    private final Distance distance = new Distance();
    private final RaceCondition raceCondition = GameFactory.raceCondition();

    public Car(Name name) {
        this.name = name;
    }

    public String getName() {
        return name.getName();
    }

    public int getDistance() {
        return distance.getDistance();
    }

    public void racingCar() {
        if (raceCondition.isMovedCar()) {
            distance.plusDistance();
        }
    }
}
