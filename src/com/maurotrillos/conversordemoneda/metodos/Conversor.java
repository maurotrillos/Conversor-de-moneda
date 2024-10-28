package com.maurotrillos.conversordemoneda.metodos;

import com.maurotrillos.conversordemoneda.modelos.Moneda;

import java.util.Map;

public class Conversor {
    public double convertir(double cantidad, String monedaOrigen, String monedaDestino, Moneda moneda) {

        Map<String, Double> tasasDeConversion = moneda.getConversion_rates();


        if (tasasDeConversion.containsKey(monedaOrigen) && tasasDeConversion.containsKey(monedaDestino)) {

            double tasaOrigen = tasasDeConversion.get(monedaOrigen);
            double tasaDestino = tasasDeConversion.get(monedaDestino);


            return (cantidad / tasaOrigen) * tasaDestino;
        } else {
            throw new IllegalArgumentException("Las monedas proporcionadas no están disponibles.");
        }
    }
}
