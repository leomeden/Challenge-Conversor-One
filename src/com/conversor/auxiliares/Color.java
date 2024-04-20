package com.conversor.auxiliares;

public class Color {


    public static String doRed(String text){
        final String ANSI_RED ="\u001B[31m";
        final String ANSI_RESET ="\u001B[0m";

        return ANSI_RED + text + ANSI_RESET;
    }
}
