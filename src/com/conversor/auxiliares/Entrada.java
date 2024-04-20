package com.conversor.auxiliares;

import com.conversor.excepciones.OpcionIncorrectaMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static int OpcionMenu(int min, int max) throws InputMismatchException, OpcionIncorrectaMenu {

        Scanner teclado = new Scanner(System.in);

        int opcionElegida = teclado.nextInt();

        if (opcionElegida < min || opcionElegida > max) {
            throw new OpcionIncorrectaMenu("Opción incorrecta - Elija una de las opciones del menú");
        }

        return opcionElegida;
    }

    public static float ValorDesde(){
        boolean seguir = true;
        float valor = 0;
        Scanner teclado = new Scanner(System.in);

        while (seguir){

            try{
                System.out.println("\nSi el valor a convertir posee decimales debe separarlo con coma (,)");
                System.out.println("Ingrese el valor a convertir: ");
                valor = teclado.nextFloat();
                seguir = false;

            } catch (InputMismatchException e){
                System.out.println(Color.doRed("Debe ingresar un valor numérico separado por comas!!"));

            }
            teclado.nextLine();
        }
        return valor;

    }


    public static float ValorHasta() throws InputMismatchException{
        Scanner teclado = new Scanner(System.in);
        return teclado.nextFloat();
    }
}


