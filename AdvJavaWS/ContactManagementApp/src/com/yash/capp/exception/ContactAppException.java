package com.yash.capp.exception;
public class ContactAppException extends RuntimeException{

    public ContactAppException(Throwable cause) {
        super(cause);
    }

    public ContactAppException(String message) {
        super(message);
    }

    public ContactAppException() {
    }
    
}
