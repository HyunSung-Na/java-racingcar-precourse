package racinggame.game;

public class GameFactory {

    public static RaceCondition raceCondition() {
        return new RandomRaceCondition();
    }

    public static RacingTrack racingTrack() {
        return new RacingTrack();
    }

    public static RacingResultView racingResultView() {
        return new RacingResultView();
    }

    public static RacingCarController racingCarController() {
        return new RacingCarController();
    }
}
