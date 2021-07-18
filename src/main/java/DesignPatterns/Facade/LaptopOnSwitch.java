package DesignPatterns.Facade;

public class LaptopOnSwitch {
    SoftwareCheck softwareCheck;
    HardwareChecks hardwareChecks;

    public LaptopOnSwitch() {
        this.softwareCheck = new SoftwareCheck();
        this.hardwareChecks = new HardwareChecks();
    }

    void switchOnLaptop(){
        if(hardwareChecks.checkAllHardware() && softwareCheck.checkSoftwareOnBoot()){
            System.out.println("Switching on laptop");
        }
    }
}
