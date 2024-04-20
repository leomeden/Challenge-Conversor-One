package com.conversor.auxiliares;

import com.conversor.models.TasaDeCambio;

public class Conversion {
    int opcion;

    public Conversion(int opcion) {
        this.opcion = opcion;
    }

    public String convertir(float valor, TasaDeCambio tasa){
        System.out.println("caso" + opcion);
        switch (this.opcion){
            case 1:
                return valor + " Dolares equivalen a " + valor * tasa.getRates().getArs() + " Pesos Argentinos";
            case 2:
                return valor + " Pesos Argentinos equivalen a " + valor / tasa.getRates().getArs() + " Dolares";
            case 3:
                return valor + " Dolares equivalen a " + valor * tasa.getRates().getBrl() + " Reales";
            case 4:
                return valor + " Reales equivalen a " + valor / tasa.getRates().getBrl() + " Dolares";
            case 5:
                return valor + " Dolares equivalen a " + valor * tasa.getRates().getCop() + " Pesos Colombianos";
            case 6:
                return valor + " Pesos Peso Colombiano equivalen a " + valor / tasa.getRates().getCop() + " Dolares";
            default:
                break;
        }
        return "No se pudo realizar la conversion";

    }
}
