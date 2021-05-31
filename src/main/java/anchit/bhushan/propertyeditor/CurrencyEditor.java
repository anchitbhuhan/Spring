package anchit.bhushan.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class CurrencyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		Currency currency = Currency.getInstance(text.toUpperCase());
		System.out.println(currency);
		setValue(currency); 
	}

	
}
