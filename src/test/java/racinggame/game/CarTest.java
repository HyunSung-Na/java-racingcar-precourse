package racinggame.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.game.domain.Car;
import racinggame.game.domain.Name;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    @DisplayName("자동차를 전진시킨다")
    @Test
    void racingCar() {
        // given
        Name name = new Name("car");
        RaceCondition raceCondition = new FixedRaceCondition(4);
        Car car = new Car(name, raceCondition);

        // when
        car.racingCar();

        // then
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @DisplayName("자동차를 정지시킨다")
    @Test
    void stopCar() {
        // given
        Name name = new Name("car");
        RaceCondition raceCondition = new FixedRaceCondition(2);
        Car car = new Car(name, raceCondition);

        // when
        car.racingCar();

        // then
        assertThat(car.getDistance()).isEqualTo(0);
    }
}
