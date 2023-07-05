package tdd;

public class Mp3 {
    private boolean isOn;

    private int volume;
    private int song;

    private boolean isPlay;
    private boolean isPause;

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;

    }

    public boolean setIsOn() {
        return false;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;

    }

    public void increaseVolume() {
        volume += 1;

    }

    public void decreaseVolume() {
        volume -= 1;
    }

    public void setSong(int song) {
        this.song = song;

    }

    public int getSong() {
        return song;
    }

    public void nextSong() {
        song = song += 1;
    }

    public void previousSong() {
        song = song -= 1;
    }

    public void setPlay(boolean isPlay) {
        this.isPlay = isPlay;
    }

    public boolean getPlay() {
        return isPlay;
    }

    public void setPause(boolean isPause) {
        this.isPause = isPause;
    }

    public boolean getPause() {
        return isPause;
    }
}
