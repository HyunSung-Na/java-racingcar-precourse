package racinggame.game.domain;

import racinggame.game.RaceCondition;

public class Car {

    private final Name name;
    private final Distance distance = new Distance();
    private final RaceCondition raceCondition;

    public Car(Name name, RaceCondition raceCondition) {
        this.raceCondition = raceCondition;
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
