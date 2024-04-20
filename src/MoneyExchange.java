import java.io.IOException;
import java.util.InputMismatchException;

import com.conversor.auxiliares.Color;
import com.conversor.auxiliares.Entrada;
import com.conversor.auxiliares.Menu;
import com.conversor.excepciones.OpcionIncorrectaMenu;

public class MoneyExchange {
    public static void main(String[] args)  {

    boolean salir = false;
    int opcion;

    while(!salir){
        try {
            Menu.MenuPrincipal();
            opcion = Entrada.OpcionMenu();
            salir = true;
            System.out.println("La opción elegida es: " + opcion);
        } catch (OpcionIncorrectaMenu e) {
            System.out.println(Color.doRed(e.getMessage()));
        } catch (InputMismatchException e) {
            System.out.println(Color.doRed("Debe ingresar un número"));
        }
    }

/*
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/b1d4e2b12c4a0efd19f853e1/pair/USD/ARS"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());*/

    }
}
