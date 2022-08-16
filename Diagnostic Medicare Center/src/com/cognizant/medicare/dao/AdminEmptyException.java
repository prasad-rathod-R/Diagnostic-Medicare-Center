package com.cognizant.medicare.dao;

public class AdminEmptyException extends Exception {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Admin details are invalid";
    }

}
