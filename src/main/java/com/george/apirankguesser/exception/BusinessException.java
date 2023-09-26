package com.george.apirankguesser.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BusinessException extends RuntimeException{

    private final HttpStatus status;

    public BusinessException(HttpStatus httpStatus, String message) {
        super(message);
        this.status = httpStatus;
    }
}
