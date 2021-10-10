package racinggame.game.domain;

import racinggame.game.GameFactory;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(String[] carNames) {
        for (String carName : carNames) {
            cars.add(readyCar(carName));
        }
    }

    private Car readyCar(String carName) {
        Name name = new Name(carName);
        return new Car(name, GameFactory.raceCondition());
    }

    public void racing() {
        this.cars.forEach(Car::racingCar);
    }

    public int findMaxDistance() {
        int maxDistance = 0;

        for (Car car : this.cars) {
            maxDistance = checkMaxDistance(car.getDistance(), maxDistance);
        }

        return maxDistance;
    }

    private int checkMaxDistance(int carDistance, int maxDistance) {
        if (carDistance > maxDistance) {
            return carDistance;
        }
        return maxDistance;
    }
}
