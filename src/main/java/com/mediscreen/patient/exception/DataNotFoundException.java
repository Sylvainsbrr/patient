package com.mediscreen.patient.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}