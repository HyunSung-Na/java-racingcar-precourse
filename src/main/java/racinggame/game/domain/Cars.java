package racinggame.game.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public void setCars(String[] carNames) {
        for (String carName : carNames) {
            cars.add(readyCar(carName));
        }
    }

    private Car readyCar(String carName) {
        Name name = new Name(carName);
        return new Car(name);
    }
}
