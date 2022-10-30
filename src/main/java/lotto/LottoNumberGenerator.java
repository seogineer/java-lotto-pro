package lotto;

import java.util.List;

interface LottoNumberGenerator {
    int START_NUMBER = 1;
    int END_NUMBER = 45;

    List<Integer> generateSixNumbers();
}
