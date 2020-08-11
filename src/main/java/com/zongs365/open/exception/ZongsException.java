package com.zongs365.open.exception;

public class ZongsException extends Exception {
    public ZongsException() {
        super();
    }

    public ZongsException(String message) {
        super(message);
    }

    public ZongsException(Throwable cause) {
        super(cause);
    }

    public ZongsException(String message, Throwable cause) {
        super(message, cause);
    }
}
