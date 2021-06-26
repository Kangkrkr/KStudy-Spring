package com.kstudy.exception;

import org.springframework.validation.ObjectError;

import java.util.List;

public class InvalidParameterException extends RuntimeException {

    private List<ObjectError> allErros;

    public InvalidParameterException() { }

    public InvalidParameterException(String message) {
        super(message);
    }

    public InvalidParameterException(List<ObjectError> allErrors) {
        this.allErros = allErrors;
    }

    public List<ObjectError> getAllErros() {
        return allErros;
    }
}
