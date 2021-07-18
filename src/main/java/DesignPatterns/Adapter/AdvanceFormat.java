package DesignPatterns.Adapter;

public class AdvanceFormat {
    private String fileToPlay;
    private String formatToPlay;
    private String resolution;

    public String getFileToPlay() {
        return fileToPlay;
    }

    public void setFileToPlay(String fileToPlay) {
        this.fileToPlay = fileToPlay;
    }

    public String getFormatToPlay() {
        return formatToPlay;
    }

    public void setFormatToPlay(String formatToPlay) {
        this.formatToPlay = formatToPlay;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
