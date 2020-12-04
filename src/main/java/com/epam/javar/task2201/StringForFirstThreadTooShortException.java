package com.epam.javar.task2201;

public class StringForFirstThreadTooShortException extends RuntimeException {
    StringForFirstThreadTooShortException (IndexOutOfBoundsException cause) {
        super(cause);
    }
}

