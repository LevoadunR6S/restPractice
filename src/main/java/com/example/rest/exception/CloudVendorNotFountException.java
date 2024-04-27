package com.example.rest.exception;

public class CloudVendorNotFountException extends RuntimeException{
    public CloudVendorNotFountException(String message) {
        super(message);
    }

    public CloudVendorNotFountException(String message, Throwable cause) {
        super(message, cause);
    }
}
