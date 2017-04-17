package com.iceedge.TreeFramework;

public class ObjectNotInTreeException extends Exception {

    public ObjectNotInTreeException() {
        super("Object not in Tree");
    }

    public ObjectNotInTreeException(String message) {
        super(message);
    }

    public ObjectNotInTreeException(Throwable throwable) {
        super(throwable);
    }
}
