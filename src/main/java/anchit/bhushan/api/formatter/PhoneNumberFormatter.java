package anchit.bhushan.api.formatter;

import anchit.bhushan.api.Phone;
import org.springframework.format.Formatter;
import java.text.ParseException;
import java.util.Locale;


/* Phone Number field can contain a country code and the number.
   This method formats the string coming from the browser into
   Object "Name" using parse() method. print() method can also
   be used to print the object back to the String.
* */
public class PhoneNumberFormatter implements Formatter<Phone> {

    @Override
    public String print(Phone object, Locale locale) {

        return object.getCode() + "-" + object.getNumber();

    }

    @Override
    public Phone parse(String text, Locale locale) throws ParseException {

        String code;
        String number;
        String[] splitted = text.split("-");

        if (text.indexOf('-') == -1) {
            code = "91";
            number = splitted[0];
        } else {
            code = splitted[0];
            if (code.equals(""))
                code = "91";
            number = splitted[1];
        }

        Phone phone = new Phone();
        phone.setCode(code);
        phone.setNumber(number);

        return phone;

    }

}
