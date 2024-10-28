package com.maurotrillos.conversordemoneda.metodos;

import com.google.gson.Gson;
import com.maurotrillos.conversordemoneda.modelos.Moneda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TasaDeCambio {

    public Moneda obtenerTasaDeCambio(String tipo){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/e6bf018cf24bf5880072b7b0/latest/"+tipo))
                .build();
        try {
            HttpResponse<String> response= client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa Divisa.");}

    }

}

