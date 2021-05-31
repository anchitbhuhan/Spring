package anchit.bhushan.api;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Currency;

public class Bill {

    private CreditCard creditCard;
    private BigDecimal amount;
    private Currency currency;
    private Date date;


    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Bill [creditCard=" + creditCard + ", amount=" + amount + ", currency=" + currency + ", date=" + date
                + "]";
    }


}
