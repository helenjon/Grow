package com.epam.javar.task2201;

public class StringForSecondThreadTooShortException extends RuntimeException {

    StringForSecondThreadTooShortException (IndexOutOfBoundsException cause) {
        super(cause);
    }


}
