package com.aydogdu.student.exception;

/**
 * @Author Ayse Aydogdu
 * @Date 8/20/2022 7:23 PM
 */
public class StudentAlreadyExistException extends RuntimeException{
    public StudentAlreadyExistException(String message){
        super(message);
    }
}
