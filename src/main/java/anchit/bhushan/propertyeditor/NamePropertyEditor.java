package anchit.bhushan.propertyeditor;

import java.beans.PropertyEditorSupport;

import anchit.bhushan.api.Name;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		Name name = new Name();
		if(text==null)
			setValue(null);
		else
		{
			String upper = text.toUpperCase();
			name.setFirstname(upper);
			System.out.println("Upper is "+upper);
			setValue(name);
		}
	}


	


	
	
}