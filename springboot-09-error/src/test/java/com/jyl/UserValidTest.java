package com.jyl;


import com.jyl.bean.User;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;


public class UserValidTest {
    public static void main(String[] args) {

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Validator validator1 = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast", "true")
                .buildValidatorFactory().getValidator();



        User user = new User("","");
        Set<ConstraintViolation<User>> violationSet =  validator.validate(user);
        for (ConstraintViolation<User> violation : violationSet) {
            System.out.println(violation.getPropertyPath()+" :"+violation.getMessage());
        }


        Set<ConstraintViolation<User>> violationSet1 = validator1.validate(user);
        for (ConstraintViolation<User> violation : violationSet1) {
            System.out.println(violation.getPropertyPath()+" :"+violation.getMessage());

        }

    }
}
