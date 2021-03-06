package anchit.bhushan.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

    private int lower;
    private int upper;

    //Executes only one time at first initialization
    @Override
    public void initialize(Age age) {

        //Post Construct Work
        this.lower = age.lower();
        this.upper = age.upper();

    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {

        if (age == null)
            return false;

        if (age >= lower && age <= upper)
            return true;
        return false;
    }


}
