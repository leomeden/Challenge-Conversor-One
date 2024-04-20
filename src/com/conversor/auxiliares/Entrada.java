package com.conversor.auxiliares;

import com.conversor.excepciones.OpcionIncorrectaMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static int OpcionMenu() throws InputMismatchException, OpcionIncorrectaMenu {

        Scanner teclado = new Scanner(System.in);

        int opcionElegida = teclado.nextInt();;

        if (opcionElegida <1 || opcionElegida > 7) {
            throw new OpcionIncorrectaMenu("Opción incorrecta - Elija una de las opciones del menú");
        }

        return opcionElegida;
    }
}


