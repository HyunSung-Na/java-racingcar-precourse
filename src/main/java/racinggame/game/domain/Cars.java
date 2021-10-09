package racinggame.game.domain;

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
        return new Car(name);
    }

    public void racing() {
        this.cars.forEach(Car::racingCar);
    }

    public int findMaxDistance() {
        return this.cars.stream()
                .mapToInt(Car::getDistance)
                .max()
                .getAsInt();
    }
}
