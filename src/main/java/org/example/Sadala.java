package org.example;

public class Sadala {
    public static void main(String[] args) {
        //Create a high class object
        HighClass warrior1 = new HighClass("Vegetta",90,30,"Black");
        warrior1.fight();

        //Create a low class object
        LowClass warrior2 = new LowClass("Kakaroto", 80, 26, "Black");
        warrior2.fight();
    }
}