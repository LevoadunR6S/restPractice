package com.example.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value = {CloudVendorNotFountException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException
            (CloudVendorNotFountException cloudVendorNotFountException) {
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudVendorNotFountException.getMessage(),
                cloudVendorNotFountException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }


}
