package com.maurotrillos.conversordemoneda.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FiltroDeMoneda {

    public List<String> filtrar(Moneda moneda){
    List<String> monedasFiltradas = new ArrayList<>();
    Map<String, Double> tasasDeConversion = moneda.getConversion_rates();

    String[] codigosDeMonedas = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
    for (String codigo : codigosDeMonedas){
        if (tasasDeConversion.containsKey(codigo)) {

            monedasFiltradas.add(codigo + ": " + tasasDeConversion.get(codigo));
        }
    }
    return monedasFiltradas;
}
}
