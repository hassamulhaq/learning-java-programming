package com.example;

public class Lamp2 {
    private boolean isOn;

    void trunOn() {
        isOn = true;
        System.out.println("is on? " + isOn);
    }

    void trunOff() {
        isOn = false;
        System.out.println("is on? " + isOn);
    }

    public static void main(String[] args) {
        Lamp2 led = new Lamp2();
        led.trunOff();
    }
}
