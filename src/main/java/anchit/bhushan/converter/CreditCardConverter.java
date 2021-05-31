package anchit.bhushan.converter;


import org.springframework.core.convert.converter.Converter;

import anchit.bhushan.api.CreditCard;

public class CreditCardConverter implements Converter<String, CreditCard> {

	@Override
	public CreditCard convert(String source) {
		
		String[] split = source.split("-");
		
		CreditCard c = new CreditCard();
		if(source.indexOf('-')!=-1)
		{	
			c.setFirst(Integer.parseInt(split[0]));
			c.setSecond(Integer.parseInt(split[1]));
			c.setThird(Integer.parseInt(split[2]));
			c.setFourth(Integer.parseInt(split[3]));
		}
		return c;
	}

	
	
}
