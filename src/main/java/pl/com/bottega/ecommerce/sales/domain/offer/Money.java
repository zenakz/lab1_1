package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {
    private BigDecimal denomination;
    private Currency currency;

    public Money(BigDecimal denomination, Currency currency){
        this.denomination=denomination;
        this.currency=currency;
    }

    public BigDecimal getDenomination(){return denomination;}

    public void setDenomination(BigDecimal denomination){this.denomination=denomination;}

    public Currency getCurrency(){return currency;}
}
