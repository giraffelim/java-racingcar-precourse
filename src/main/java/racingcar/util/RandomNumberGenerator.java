package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    private static final int START_INCLUSIVE = 0;
    private static final int END_INCLUSIVE = 9;

    private RandomNumberGenerator() {

    }

    public static int getRandomNumber() {
        return Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
    }
}
