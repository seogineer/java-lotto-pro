package lotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LottoGameTest {
    @Test
    void 로또_구매_개수() {
        assertThat(new LottoGame(10000).countPurchase()).isEqualTo(10);
    }
}
