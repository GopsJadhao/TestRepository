package com.innoventes.test.app.controller;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class AppExceptionController {



    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> invalidArgMethod(MethodArgumentNotValidException ex){

        Map<String,String>map=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->{
            map.put(error.getField(),error.getDefaultMessage());
                });
        return map;

    }
}
