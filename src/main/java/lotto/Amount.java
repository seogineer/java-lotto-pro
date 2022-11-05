package lotto;

import static lotto.Constant.LOTTO_PRICE;

import java.util.Objects;

public class Amount {
    private final int amount;
    private int balance;

    public Amount(int amount) {
        this.amount = amount;
        this.balance = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isPurchase(int quantity) {
        return balance >= quantity * LOTTO_PRICE;
    }

    public void purchase(PurchaseQuantity quantity) {
        balance -= LOTTO_PRICE * quantity.getPurchaseQuantity();
    }

    public int getPurchase() {
        return balance / LOTTO_PRICE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Amount amount1 = (Amount) o;
        return amount == amount1.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
