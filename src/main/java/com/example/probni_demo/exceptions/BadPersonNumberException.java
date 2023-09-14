package com.example.probni_demo.exceptions;

public class BadPersonNumberException extends RuntimeException{
    public BadPersonNumberException(String message) {
        super(message);
    }
}
