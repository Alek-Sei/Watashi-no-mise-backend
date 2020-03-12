package com.onex.watashinomise.exception;

public class UserNameAlreadyExistsException extends Throwable {
    /**
     *Warning supression
     */
    private static final long serialVersionUID = 1L;

    public UserNameAlreadyExistsException(String username) {
        super();
    }
}
