This package contains different formatter class to format the input before sending it to the handler
methods.

The main function of the Formatter class is to povide print() and parse() logic

The standard structure of the classes in this package are :
```
java

public class <className> implements Formatter<T>{

    @Override
    public String print(<Object> object, Locale locale) {
        
        //Definition
    }


    @Override
    public <Object> parse(String text, Locale locale) throws ParseException {
        
        //Definition
        
    }

}

```