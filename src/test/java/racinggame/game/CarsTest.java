package racinggame.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.game.domain.Cars;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars();
    }

    @DisplayName("자동차 이름들을 받아 자동차를 생성한다")
    @Test
    void setCars() {
        // given
        String[] carNames = {"abc", "def"};

        // when
        cars.setCars(carNames);

        // then
        assertThat(cars.getCars().size()).isEqualTo(2);
    }

    @DisplayName("자동차들의 최대 거리를 구한다")
    @Test
    void findMaxDistance() {
        // given
        String[] carNames = {"abc", "def", "gif", "zip", "top", "jar"};
        cars.setCars(carNames);
        cars.racing();

        // when
        int maxDistance = cars.findMaxDistance();

        // then
        assertThat(maxDistance).isNotEqualTo(0);
    }
}
