package com.cognizant.medicare.dao;

public class PatientEmptyException extends Exception {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Details is Empty";

    }

}
