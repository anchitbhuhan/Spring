package anchit.bhushan.api.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;
import anchit.bhushan.api.CreditCard;

/* Credit card is of the form XXXX-XXXX-XXXX-XXXX.
   This method formats the string coming from the browser into
   Object "CreditCard" using parse() method. print() method can
   also be used to print the object back to the String.
* */
public class CreditCardFormatter implements Formatter<CreditCard> {



    @Override
    public String print(CreditCard object, Locale locale) {

        return object.getFirst() + "-" + object.getSecond() + "-" +
                object.getThird() + "-" + object.getFourth();
    }

    @Override
    public CreditCard parse(String text, Locale locale) throws ParseException {

        String[] split = text.split("-");

        CreditCard c = new CreditCard();

        if (text.indexOf('-') != -1) {
            c.setFirst(Integer.parseInt(split[0]));
            c.setSecond(Integer.parseInt(split[1]));
            c.setThird(Integer.parseInt(split[2]));
            c.setFourth(Integer.parseInt(split[3]));
        }

        return c;

    }


}
