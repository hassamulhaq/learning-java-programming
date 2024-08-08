package com.example.java_access_modifiers;

class Data {
    private String name = "im private var";
    public String pname = "im public var";

    public String getPrivateVarThroughPubFun() {
        return this.name;
    }
}

class Animal {
    public void hello() {
        System.out.println("Hello");
    }

    private void world() {
        System.out.println("World");
    }

    public static void main(String[] args) {
        Data dd = new Data();
        //System.out.println("dd.name: " + dd.name); // private access modifier
        System.out.println("dd.pname: " + dd.pname);

        System.out.println("haha: " + dd.getPrivateVarThroughPubFun());
    }
}
