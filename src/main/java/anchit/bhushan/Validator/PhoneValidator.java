package anchit.bhushan.Validator;

import anchit.bhushan.api.Phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<PhoneAnnotation, Phone> {


    @Override
    public void initialize(PhoneAnnotation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Phone phone, ConstraintValidatorContext context) {


        if (phone.getNumber().length() != 10) {
            System.out.println("Inside isValid");
            return false;
        }

        return true;
    }
}
