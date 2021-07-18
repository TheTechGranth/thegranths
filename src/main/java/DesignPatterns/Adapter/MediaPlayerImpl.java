package DesignPatterns.Adapter;

public class MediaPlayerImpl implements MediaPlayer {
    MediaPlayerAdapter mediaPlayerAdapter;
    MediaPlayer mediaPlayer;
    @Override
    public void play(String fileToPlay, String formatToPlay) {
        if(formatToPlay.equals("mp3")){
            mediaPlayer = new DefaultMediaPlayer();
            mediaPlayer.play(fileToPlay,formatToPlay);
        }else{
            AdvanceFormat advanceFormat = new AdvanceFormat();
            advanceFormat.setResolution("720p");
            mediaPlayerAdapter = new MediaPlayerAdapter(advanceFormat);
            mediaPlayerAdapter.play(fileToPlay,formatToPlay);
        }
    }
}
