package anchit.bhushan.propertyeditor;

import java.beans.PropertyEditorSupport;

import anchit.bhushan.api.CreditCard;

public class CreditCardPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		String[] split = text.split("-");
		
		CreditCard c = new CreditCard();
		if(text.indexOf('-')!=-1)
		{	
			c.setFirst(Integer.parseInt(split[0]));
			c.setSecond(Integer.parseInt(split[1]));
			c.setThird(Integer.parseInt(split[2]));
			c.setFourth(Integer.parseInt(split[3]));
		}
		setValue(c);
	}

	
}
