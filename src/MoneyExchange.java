
import java.io.IOException;
import java.util.InputMismatchException;


import com.conversor.auxiliares.*;
import com.conversor.excepciones.ErrorEnRequest;
import com.conversor.excepciones.OpcionIncorrectaMenu;
import com.conversor.models.TasaDeCambio;
import com.google.gson.Gson;

public class MoneyExchange {
    public static void main(String[] args)  {

    boolean salir = false;
    int opcion;
    float valorAConvertir;
    String respuesta;

    while(!salir){
        Menu.MenuPrincipal();
        try {
            //permite ingresar los valores minimo y maximo a ingresar como opción
            opcion = Entrada.OpcionMenu(1, 7);

            if(opcion > 0 && opcion <7){
                //System.out.println("La opción elegida es: " + opcion);

                valorAConvertir = Entrada.ValorDesde();
                //System.out.println("El valor a convertir es: " + valorAConvertir);

                respuesta = ConsultaAPI.consulta();
                //System.out.println(respuesta);

                Gson gson = new Gson();
                TasaDeCambio tasas = gson.fromJson(respuesta, TasaDeCambio.class);
/*
                System.out.println("Peso Argentino: " + tasas.getRates().getArs());
                System.out.println("Real Brasileño: " + tasas.getRates().getBrl());
                System.out.println("Peso Colombianoo: " + tasas.getRates().getCop());

                System.out.println(gson.toJson(tasas).indent(3));
*/
                Conversion conversion = new Conversion(opcion);
                String resultado = conversion.convertir(valorAConvertir, tasas);
                System.out.println(resultado);
            }else{
                salir = true;
            }


        } catch (OpcionIncorrectaMenu e) {
            System.out.println(Color.doRed(e.getMessage()));
        } catch (InputMismatchException e) {
            System.out.println(Color.doRed("Debe ingresar un número"));
        } catch (ErrorEnRequest e) {
            System.out.println(e.getMessage());
        } catch (IOException | InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println("Ocurrio un error inesperado en la consulta a la API");
            System.out.println(e.getMessage());
        }

    }

        System.out.println("Gracias por utilizar nuestra aplicación!!!");



    }
}
