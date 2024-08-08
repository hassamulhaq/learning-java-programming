package com.example.this_keyword;

class MainX {

    boolean isOn = false;

    void getIsOn() {
        System.out.println("before::isOn: " + isOn);
        this.isOn = true;
        System.out.println("after::isOn: " + isOn);
    }

    public static void main(String[] args) {
        MainX mm = new MainX();
        mm.getIsOn();
    }
}
