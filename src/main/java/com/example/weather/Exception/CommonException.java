package com.example.weather.Exception;

import org.springframework.http.HttpStatus;

public class CommonException extends Exception{
    private static final long serialVersionUID = 1L;
    private String errorCode;
    private String message;
    private HttpStatus status;

    public CommonException(final String errorCode, final String message, final HttpStatus status) {
        this.errorCode = errorCode;
        this.message = message;
        this.status = status;
    }

    public CommonException() {
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public HttpStatus getStatus() {
        return this.status;
    }
}
