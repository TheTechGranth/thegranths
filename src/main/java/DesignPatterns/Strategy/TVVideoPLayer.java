package DesignPatterns.Strategy;

public class TVVideoPLayer extends VideoPlayer {
    public TVVideoPLayer(Device device,Resolution resolution) {
        this.currentDevice = device;
        this.currentResolution = resolution;
    }

    @Override
    void display() {
       this.getDevice();
       this.getResolution();
    }
}
