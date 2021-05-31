package anchit.bhushan.SpringCustomValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import anchit.bhushan.api.User;

public class UserNameSpringValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return (User.class.equals(clazz));
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "user.username.empty");

		String username = ((User) target).getUsername();
		if(!username.contains("_"))
			errors.rejectValue("username", "user.username.invalidString");
	}

}
