
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
    boolean continuar = true;
    int opcion;
    float valorAConvertir;
    String respuesta;

    while(!salir){
        Menu.MenuPrincipal();
        try {
            //permite ingresar los valores minimo y maximo a ingresar como opción
            opcion = Entrada.OpcionMenu(1, 7);

            if(opcion != 7){

                valorAConvertir = Entrada.ValorDesde();

                respuesta = ConsultaAPI.consulta();

                Gson gson = new Gson();
                TasaDeCambio tasas = gson.fromJson(respuesta, TasaDeCambio.class);

                Conversion conversion = new Conversion(opcion);
                String resultado = conversion.convertir(valorAConvertir, tasas);
                System.out.println(resultado);

                while(continuar) {
                    try{
                        String entrada = Entrada.Continuar();
                        if(entrada.equals("n") || entrada.equals("N")){
                            salir = true;
                            continuar = false;
                        }
                        if(entrada.equals("s") || entrada.equals("S")){
                            continuar = false;
                        }
                    } catch (OpcionIncorrectaMenu e) {
                        System.out.println(Color.doRed(e.getMessage()));
                    } catch (InputMismatchException e) {
                        System.out.println(Color.doRed("Valor ingresado incorrecto"));
                    }
                }
                continuar = true;



            } else{

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
