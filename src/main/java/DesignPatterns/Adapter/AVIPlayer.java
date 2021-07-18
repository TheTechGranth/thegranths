package DesignPatterns.Adapter;

public class AVIPlayer implements AdvanceMediaPlayer {
    @Override
    public void playAdvanceFormat(AdvanceFormat advanceFormat) {
        System.out.println("playing using Advance media player "+advanceFormat.getFileToPlay()+"."+advanceFormat.getFormatToPlay()+" in resolution "+ advanceFormat.getResolution());
    }
}
