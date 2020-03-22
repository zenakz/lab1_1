package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {

    private BigDecimal denomination;
    private Currency currency;

    public Money(BigDecimal denomination, Currency currency) {
        this.denomination = denomination;
        this.currency = currency;
    }

    public BigDecimal getDenomination() {
        return denomination;
    }

    public void setDenomination(BigDecimal denomination) {
        this.denomination = denomination;
    }

    Money subtract(Money subtrahend) {
        return new Money(denomination.subtract(subtrahend.getDenomination()), currency);
    }

    Money multiply(int factor) {
        return new Money(denomination.multiply(BigDecimal.valueOf(factor)), currency);
    }

    public Currency getCurrency() {
        return currency;
    }
}

