package com.example.demo.Exception;

public class BadRequest extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public BadRequest(String errorMessage) {
        super(errorMessage);
    }
}
