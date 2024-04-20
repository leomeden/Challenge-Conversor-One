package com.conversor.excepciones;

public class OpcionIncorrectaMenu extends Exception{

    public OpcionIncorrectaMenu(){}

    public OpcionIncorrectaMenu(String msg_error){
        super(msg_error);
    }
}
