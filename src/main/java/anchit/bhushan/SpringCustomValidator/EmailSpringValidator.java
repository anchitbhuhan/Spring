package anchit.bhushan.SpringCustomValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import anchit.bhushan.api.User;

public class EmailSpringValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communication.email", "user.communication.email.Empty");
		
		String email = ((User) target).getCommunication().getEmail();
		
		if(!email.contains("@"))
			errors.rejectValue("communication.email", "user.communication.email.invalidEmail");
			
	}

}
