package DesignPatterns.Adapter;

public class DefaultMediaPlayer implements MediaPlayer {
    @Override
    public void play(String fileToPlay, String formatToPlay) {
        System.out.println("playing "+fileToPlay+"."+formatToPlay);
    }
}
