
import java.io.IOException;
import java.util.InputMismatchException;


import com.conversor.auxiliares.Color;
import com.conversor.auxiliares.ConsultaAPI;
import com.conversor.auxiliares.Entrada;
import com.conversor.auxiliares.Menu;
import com.conversor.excepciones.ErrorEnRequest;
import com.conversor.excepciones.OpcionIncorrectaMenu;

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
            salir = true;
            System.out.println("La opción elegida es: " + opcion);

        } catch (OpcionIncorrectaMenu e) {
            System.out.println(Color.doRed(e.getMessage()));
        } catch (InputMismatchException e) {
            System.out.println(Color.doRed("Debe ingresar un número"));
        }

        valorAConvertir = Entrada.ValorDesde();
        System.out.println("El valor a convertir es: " + valorAConvertir);


        try {
            respuesta = ConsultaAPI.consulta();
            System.out.println(respuesta);
        }catch (ErrorEnRequest e) {
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
