package anchit.bhushan.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import anchit.bhushan.api.Name;

public class NameValidator implements ConstraintValidator<NameAnnotation, Name> {

    private int lower;
    private int upper;


    @Override
    public void initialize(NameAnnotation name) {
        this.lower = name.lower();
        this.upper = name.upper();
    }

    @Override
    public boolean isValid(Name name, ConstraintValidatorContext context) {

    	System.out.println("name in valid is "+name.toString());
        if (name == null)
            return false;
        if (name.getFirstname() == null)
            return false;
        if (!name.getFirstname().matches("[a-zA-Z]*"))
            return false;
        if (name.getMiddlename() != null && !name.getMiddlename().matches("[a-zA-Z]*"))
            return false;
        if (name.getLastname() != null && !name.getLastname().matches("[a-zA-Z]*"))
            return false;
        return true;
    }
}
