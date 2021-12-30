package com.knoldus.customizedAnnotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.*;

public class ColorValidator implements ConstraintValidator<ColorValidation, String> {
    public boolean isValid(String colorName, ConstraintValidatorContext cxt) {
        List list = Arrays.asList(new String[]{"RED", "GREEN", "BLUE"});
        return list.contains(colorName);
    }
}
