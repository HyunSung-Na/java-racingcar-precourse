package racinggame.game.domain;

public class Car {

    private final Name name;
    private final Distance distance = new Distance();

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
        distance.plusDistance();
    }
}
