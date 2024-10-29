package com.maurotrillos.conversordemoneda.modelos;

import java.util.Map;

public class Moneda{
    private String base_code;
    private Map<String, Double> conversion_rates;
    private String time_last_update_utc;

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }
}
