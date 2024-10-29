package com.maurotrillos.conversordemoneda.modelos;

public class MonedaPar {
    private String base_code;
    private String target_code;
    private Double conversion_rate;
    private Double conversion_result;
    private String time_last_update_utc;

    public String getTime_last_update_utc() {
        return time_last_update_utc.substring(4,16);
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(Double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public Double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(Double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return "Para la fecha (" + time_last_update_utc.substring(5,16)+
                ") "+ "la tasa de cambio es de: \n" + "1.0 '" + base_code + "' por "
                + conversion_rate + " '" + target_code + "' \n" +
                "el total de su conversion es: "+conversion_result+" '"+target_code+"'";
    }
}
