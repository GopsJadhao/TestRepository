package com.innoventes.test.app.ValidAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenPositiveOrZeroValitor  implements ConstraintValidator<EvenPositiveOrZero,Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {

        if(integer%2==0){
            return true;
        }else {
            return false;
        }



    }
}
