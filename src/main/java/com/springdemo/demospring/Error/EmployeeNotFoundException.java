package com.springdemo.demospring.Error;

public class EmployeeNotFoundException extends Exception{
    public EmployeeNotFoundException(String s) {
        super(s);
    }
}
