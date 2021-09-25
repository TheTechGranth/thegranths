package DesignPatterns.Strategy;

public class PhonePlayer extends VideoPlayer {
    public PhonePlayer(Device device,Resolution resolution) {
        this.currentDevice = device;
        this.currentResolution = resolution;
    }

    @Override
    void display() {
        this.getDevice();
        this.getResolution();
    }
}
