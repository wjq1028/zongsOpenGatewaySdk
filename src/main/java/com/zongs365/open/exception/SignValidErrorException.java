package com.zongs365.open.exception;

public class SignValidErrorException extends Exception {
    public SignValidErrorException() {
        super();
    }

    public SignValidErrorException(String message) {
        super(message);
    }

    public SignValidErrorException(Throwable cause) {
        super(cause);
    }

    public SignValidErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
