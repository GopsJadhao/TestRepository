package com.innoventes.test.app.ValidAnnotation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EvenPositiveOrZeroValitor.class)
public @interface EvenPositiveOrZero {
    public String message()default "Invalid matter : this is even or zero number";
    Class<?>[]group()default {};
    Class<?extends Payload>[]payload()default  {};
}
