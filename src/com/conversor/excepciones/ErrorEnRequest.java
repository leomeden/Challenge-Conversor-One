package com.conversor.excepciones;

    public class ErrorEnRequest extends Exception{

        public ErrorEnRequest(){}

        public ErrorEnRequest(String msg_error){
            super(msg_error);
        }
    }

