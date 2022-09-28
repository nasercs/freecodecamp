package com.example.freecodecamp.config.advice;

import com.example.freecodecamp.config.advice.dto.ErrorDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.format.DateTimeParseException;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(DateTimeParseException.class)
    public ErrorDto dateTimeParsingException() {
        return new ErrorDto("Invalid Date");
    }

}
