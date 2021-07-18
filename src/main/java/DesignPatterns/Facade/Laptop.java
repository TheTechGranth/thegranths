package DesignPatterns.Facade;

public class Laptop {
    public static void main(String[] args) {
        LaptopOnSwitch laptopOnSwitch = new LaptopOnSwitch();
        laptopOnSwitch.switchOnLaptop();
    }
}
