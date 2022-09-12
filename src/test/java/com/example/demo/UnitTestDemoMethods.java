package com.example.demo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class UnitTestDemoMethods {

    static DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    static DecimalFormat df = new DecimalFormat("0.00", symbols);
    public static int sum(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(int a, int b){
        String d = df.format((double) a / b);
        return Double.parseDouble(d);
    }
}
