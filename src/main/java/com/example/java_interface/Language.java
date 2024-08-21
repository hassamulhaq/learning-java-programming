package com.example.java_interface;

public interface Language {
    void sayHello();

    void setLanguage(String language);

    public void getLanguage();
}

class Arabic implements Language {
    @Override
    public void sayHello() {
        System.out.println("Hello Arabic");
    }

    @Override
    public void setLanguage(String lang) {
        System.out.println("Arabic language set to " + lang);
    }

    public void getLanguage() {
        System.out.println("Arabic");
    }
}

class Main {
    public static void main(String[] args) {
        Language language = new Arabic();
        language.sayHello();
        language.setLanguage("Arabic");
    }
}
