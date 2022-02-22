package racingcar.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import racingcar.domain.RacingCar;
import racingcar.domain.RacingCars;

public class OutputView {

    private static final String WINNER_NAME_DELIMITER = ", ";
    private static final String NAME_POSITION_CONNECTOR = " : ";
    private static final String POSITION_MARKER = "-";
    private static final String TRIAL_RESULT = "실행 결과:";
    private static final String WINNER_ANNOUNCEMENT = "가 최종 우승했습니다.";

    public static void printGameStartMessage() {
        System.out.println(TRIAL_RESULT);
    }

    public static void printCurrentRaceState(RacingCars racingCars) {
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            raceStateFormat(racingCar.getName(), racingCar.getPosition());
        }
    }

    private static void raceStateFormat(String name, int position) {
        System.out.println(name + NAME_POSITION_CONNECTOR + visualizePosition(position));
    }

    private static String visualizePosition(int position) {
        return POSITION_MARKER.repeat(position);
    }

    public static void printWinners(List<String> winnerNames) {
        System.out.println(String.join(WINNER_NAME_DELIMITER, winnerNames) + WINNER_ANNOUNCEMENT);
    }
}
