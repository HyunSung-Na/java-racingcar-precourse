package racinggame.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.game.domain.Round;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RoundTest {

    @DisplayName("경주 round를 1 미만으로 생성한다")
    @Test
    void createMinRound() {
        assertThrows(IllegalArgumentException.class,
                () -> new Round(0));
    }

    @DisplayName("경주 round를 1 이상으로 생성한다")
    @Test
    void createRound() {
        // given
        int roundNumber = 2;

        // when
        Round round = new Round(roundNumber);

        // then
        assertThat(round.getRound()).isEqualTo(roundNumber);
    }
}
