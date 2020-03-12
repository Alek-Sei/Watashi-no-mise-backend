package com.onex.watashinomise.exception;

public class EmailAlreadyExistsException extends Throwable {
    /**
     *Warning supression
     */
    private static final long serialVersionUID = 1L;

    public EmailAlreadyExistsException(String email) {
        super();
    }
}