package DesignPatterns.Facade;

public class SoftwareCheck {
    OSCheckOnBoot osCheckOnBoot;
    DriverCheck driverCheck;

    public SoftwareCheck() {
        this.osCheckOnBoot = new OSCheckOnBoot();
        this.driverCheck = new DriverCheck();
    }

    boolean checkSoftwareOnBoot(){
        return osCheckOnBoot.checkOSOnBoot() && driverCheck.checkDriverOnBoot();
    }
}
