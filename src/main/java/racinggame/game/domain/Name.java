package racinggame.game.domain;

public class Name {

    private final String name;

    private final int MAX_NAME_LENGTH = 5;
    private final int MIM_NAME_LENGTH = 1;
    private final String ERROR_CAR_NAME_MAX_LENGTH_MESSAGE = "[ERROR]자동차 이름은 5글자 이하입니다.";
    private final String ERROR_CAR_NAME_MIN_LENGTH_MESSAGE = "[ERROR]자동차 이름은 1글자 이상입니다.";

    public Name(String name) {
        validateLengthName(name);
        this.name = name;
    }

    private void validateLengthName(String name) {
        char[] validName = name.toCharArray();

        if (validName.length > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_MAX_LENGTH_MESSAGE);
        }

        if (validName.length < MIM_NAME_LENGTH) {
            throw new IllegalArgumentException(ERROR_CAR_NAME_MIN_LENGTH_MESSAGE);
        }
    }

    public String getName() {
        return name;
    }
}
