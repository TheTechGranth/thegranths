package DesignPatterns.Facade;

public class HardwareChecks {
    MotherBoard motherBoard;
    RAM ram;

    public HardwareChecks() {
        this.motherBoard = new MotherBoard();
        this.ram = new RAM();
    }

    boolean checkAllHardware(){

        return motherBoard.checkMotherBoardOnBoot() && ram.checkRAMOnBoot();
    }
}
