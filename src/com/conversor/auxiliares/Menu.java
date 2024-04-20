package com.conversor.auxiliares;

public class Menu {
    public static void MenuPrincipal(){
        String menu = """
                
                ******** Bienvenid@ al Conversor de Monedas ********
                
                Seleccione la conversión que desea realizar:
                        
                        1) Dólar ------------> Peso Argentino
                        2) Peso Argentino ---> Dólar
                        3) Dólar ------------> Real Brasileño
                        4) Real Brasileño ---> Dólar
                        5) Dólar ------------> Peso Colombiano
                        6) Peso Colombiano --> Dólar
                        7) Salir
                        
                ****************************************************
                """;
        /*System.out.println("\n******** Bienvenid@ al Conversor de Monedas ********\n");
        System.out.println("Seleccione la conversión que desea realizar:");*/
        System.out.println(menu);
        System.out.print("Ingrese su opción: ");
    }
}
