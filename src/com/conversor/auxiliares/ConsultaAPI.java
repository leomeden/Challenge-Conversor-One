package com.conversor.auxiliares;

import com.conversor.excepciones.ErrorEnRequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ConsultaAPI{
    public static String consulta() throws IOException, InterruptedException, ErrorEnRequest {
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/b1d4e2b12c4a0efd19f853e2/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.body());
        client.close();
        if (response.statusCode() >=200 && response.statusCode() < 300 ){
            return response.body();
        } else {
            throw new ErrorEnRequest("Fallo la consulta a la API - Intente nuevamente");
        }

    }

}
