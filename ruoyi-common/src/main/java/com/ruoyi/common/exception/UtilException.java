package com.ruoyi.common.exception;

public class UtilException extends RuntimeException {

    private static final long serialVersionUID = -2053293554406854385L;

    public UtilException(Throwable e) {
        super(e.getMessage(), e);
    }

    public UtilException(String message) {
        super(message);
    }

    public UtilException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
