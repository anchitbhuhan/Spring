package anchit.bhushan.Validator;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = UserNameValidator.class)
public @interface Username {

    String message() default "{Username.invalidUserName}";

    int lower() default 8;

    int upper() default 30;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


}
