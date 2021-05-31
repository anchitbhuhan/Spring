package anchit.bhushan.api.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;
import anchit.bhushan.api.Name;

/* Name field can contain a first name, middle name and last name.
   This method formats the string coming from the browser into
   Object "Name" using parse() method. print() method can
   also be used to print the object back to the String.
* */
public class NameFormatter implements Formatter<Name> {


    @Override
    public String print(Name object, Locale locale) {
        return null;
    }

    @Override
    public Name parse(String text, Locale locale) throws ParseException {

        String[] split = text.split(" ");
        Name name = new Name();

        for (int i = 0; i < split.length; i++) {
            if (i == 0)
                name.setFirstname(split[i]);
            if (i == 1)
                name.setMiddlename(split[i]);
            if (i == 2)
                name.setLastname(split[i]);
        }

        return name;
    }

}
