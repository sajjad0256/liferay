package com.example.articles.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        // Custom handling for exceptions
        return "error/errorPage"; // Path to the error page JSP
    }
}
