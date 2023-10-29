package com.example.probni_demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IvalidInputException extends RuntimeException{
    public IvalidInputException() {
    }

    public IvalidInputException(String message) {
        super(message);
    }

    public IvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public IvalidInputException(Throwable cause) {
        super(cause);
    }

    public IvalidInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
