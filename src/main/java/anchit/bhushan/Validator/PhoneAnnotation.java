package anchit.bhushan.Validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PhoneValidator.class)
public @interface PhoneAnnotation {

    String message() default "{PhoneAnnotation.invalidPhoneMessage}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
