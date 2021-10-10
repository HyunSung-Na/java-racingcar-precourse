package racinggame.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.game.domain.Name;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameTest {

    @DisplayName("이름을 5자를 넘어서 생성한다")
    @Test
    void overLengthName() {
        assertThrows(IllegalArgumentException.class,
                () -> new Name("5자이상으로생성"));
    }

    @DisplayName("이름을 1자 미만으로 생성한다")
    @Test
    void minLengthName() {
        assertThrows(IllegalArgumentException.class,
                () -> new Name(""));
    }
}
