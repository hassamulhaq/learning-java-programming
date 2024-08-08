package com.example.methods;

public class MethodOverloadingHelperService {
    private String formatNumber(int val) {
        return String.format("%d", val);
    }

    private String formatNumber(double val) {
        return String.format("%.3f", val);
    }

    private String formatNumber(String val) {
        return String.format("%.2f", Double.parseDouble(val));
    }

    public static void main(String[] args) {
        MethodOverloadingHelperService m = new MethodOverloadingHelperService();
        System.out.println(m.formatNumber(33));
        System.out.println(m.formatNumber("33.9935"));
        System.out.println(m.formatNumber(50));
    }
}
