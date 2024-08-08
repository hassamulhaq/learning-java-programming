package com.example;

public class Lamp {

    private boolean isOn;

    void trunOn() {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    void trunOff() {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}

class Main {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.trunOn();
        halogen.trunOff();
    }
}
