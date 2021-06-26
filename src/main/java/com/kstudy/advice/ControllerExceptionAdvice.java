package com.kstudy.advice;

import com.kstudy.exception.InvalidParameterException;
import com.kstudy.exception.MemberNotFoundException;
import com.kstudy.model.exception.ErrorInfo;
import com.kstudy.model.exception.ErrorResponse;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;

@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler
    public ErrorResponse handleInvalidParameteException(InvalidParameterException e) {

        List<ObjectError> allErros = e.getAllErros();

        return ErrorResponse.of()
                .timestamp(LocalDateTime.now())
                .errorInfo(ErrorInfo.INVALID_PARAMETER.getInfo())
                .errorDetails(allErros)
                .build();
    }

    @ExceptionHandler
    public ErrorResponse handleMemberNotFoundException(MemberNotFoundException e) {
        return ErrorResponse.of()
                .timestamp(LocalDateTime.now())
                .errorInfo(ErrorInfo.DATA_NOT_FOUND.getInfo())
                .build();
    }

    @ExceptionHandler
    public ErrorResponse handleAllException(Exception e) {
        return ErrorResponse.of()
                .timestamp(LocalDateTime.now())
                .errorInfo(ErrorInfo.NO_IDENTIFIED_ERROR.getInfo())
                .build();
    }
}
