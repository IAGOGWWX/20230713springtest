package com.jyl.controller;


import com.jyl.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {



    @PostMapping("/user")
    public String add(@Valid User user , BindingResult result){
        if(result.getErrorCount()>0){
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuffer stringBuffer = new StringBuffer();
            for(FieldError fieldError : fieldErrorList){
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }

        System.out.println(user);
        return "Success";
    }


}
