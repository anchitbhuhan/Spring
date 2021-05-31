package anchit.bhushan.Validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameValidator.class)
public @interface NameAnnotation {

    String message() default "{NameAnnotation.invalidNameMessage}";

    int lower() default 1;

    int upper() default 50;


    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
