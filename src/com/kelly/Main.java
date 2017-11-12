package com.kelly;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "Dell", "120", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-2200", "Asus", 4, 6, "v2.44");


        PC thePC1 = new PC(theCase, theMonitor, theMotherboard);

        thePC1.powerUp();

        Dimensions kellyDimensions = new Dimensions(8, 24, 30);

        Case kellyCase = new Case("T1000", "DIY PC", "400w", kellyDimensions);
        Monitor kellyMonitor = new Monitor("LG3490", "LG", 34, new Resolution(3440, 1440));
        Motherboard kellyMotherBoard = new Motherboard("jfk-434", "Asus", 4, 3, "v3,43");


        PC kellyPC = new PC(kellyCase, kellyMonitor, kellyMotherBoard);
    }
}
