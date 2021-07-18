package DesignPatterns.Adapter;

public class MediaPlayerAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;
    AdvanceFormat advanceFormat;

    public MediaPlayerAdapter(AdvanceFormat advanceFormat) {
        advanceMediaPlayer = new AVIPlayer();
        this.advanceFormat = advanceFormat;
    }

    @Override
    public void play(String fileToPlay, String formatToPlay) {
        advanceFormat.setFileToPlay(fileToPlay);
        advanceFormat.setFormatToPlay(formatToPlay);
        advanceMediaPlayer.playAdvanceFormat(advanceFormat);
    }
}
