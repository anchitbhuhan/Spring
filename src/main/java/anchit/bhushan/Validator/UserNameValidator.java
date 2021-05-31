package anchit.bhushan.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<Username, String> {

    private int lower;
    private int upper;

    //Executes only one time at first initialization
    @Override
    public void initialize(Username username) {

        //Post Construct Work
        this.lower = username.lower();
        this.upper = username.upper();

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value == null)
            return false;

        if (value.length() < lower || value.length() > upper)
            return false;
        if (!value.matches("^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$"))
            return false;
        return true;
    }


}
