package com.example.calc;

public enum CalcTheme {

    NIGHT(R.style.Theme_Calc_Night, "night"),

    DEFAULT(R.style.Theme_Calc, "default");

    private int resource;

    private String key;

    public int getResource() {
        return resource;
    }

    public String getKey() {
        return key;
    }

    CalcTheme(int resource, String key) {
        this.resource = resource;
        this.key = key;
    }


}
