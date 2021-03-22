package com.knightboot.weaver.internal.exception;

/**
 * Created by Knight-ZXW on 21/3/22.
 */
public class IllegalAnnotationException extends IllegalArgumentException {

    public IllegalAnnotationException() {
    }

    public IllegalAnnotationException(String s) {
        super(s);
    }

    public IllegalAnnotationException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAnnotationException(Throwable cause) {
        super(cause);
    }
}
