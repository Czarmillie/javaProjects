package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mp3Test {
    @Test
    public void ifMp3IsOnTest() {
        Mp3 apple = new Mp3();
        boolean status = apple.getIsOn();
        assertEquals(false, status);

        apple.setIsOn(true);
        boolean newStatus = apple.getIsOn();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifMp3IsOffTest() {
        Mp3 apple = new Mp3();
        apple.setIsOn(true);
        boolean status = apple.getIsOn();
        assertEquals(true, status);

        apple.setIsOn(false);
        boolean newStatus = apple.getIsOn();
        assertEquals(false, newStatus);
    }

    @Test
    public void mp3VolumeTest() {
        Mp3 apple = new Mp3();
        apple.setIsOn(true);
        boolean status = apple.getIsOn();
        assertEquals(true, status);
        apple.setVolume(5);
        int currentVolume = apple.getVolume();
        assertEquals(5, currentVolume);

        apple.increaseVolume();
        currentVolume = apple.getVolume();
        assertEquals(6, currentVolume);
    }

    @Test
    public void mp3VolumeDecreaseTest() {
        Mp3 apple = new Mp3();
        apple.setIsOn(true);
        boolean status = apple.getIsOn();
        assertEquals(true, status);
        apple.setVolume(8);
        int currentVolume = apple.getVolume();
        assertEquals(8, currentVolume);

        apple.decreaseVolume();
        currentVolume = apple.getVolume();
        assertEquals(7, currentVolume);

    }

    @Test
    public void mp3NextSongTest() {
        Mp3 apple = new Mp3();
        apple.setIsOn(true);
        boolean status = apple.getIsOn();
        assertEquals(true, status);
        apple.setSong(2);
        int currentSong = apple.getSong();
        assertEquals(2, currentSong);

        apple.nextSong();
        currentSong = apple.getSong();
        assertEquals(3, currentSong);
    }

    @Test
    public void mp3PreviousSongTest() {
        Mp3 apple = new Mp3();
        apple.setIsOn(true);
        boolean status = apple.getIsOn();
        assertEquals(true, status);
        apple.setSong(5);
        int currentSong = apple.getSong();
        assertEquals(5, currentSong);

        apple.previousSong();
        currentSong = apple.getSong();
        assertEquals(4, currentSong);
    }

    @Test
    public void ifMp3CanPlayTest() {
        Mp3 apple = new Mp3();
        apple.setIsOn(true);
        boolean status = apple.getIsOn();
        assertEquals(true, status);

        apple.setPlay(true);
        boolean newStatus = apple.getPlay();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifMp3CanPauseTest() {
        Mp3 apple = new Mp3();
        apple.setIsOn(true);
        boolean status = apple.getIsOn();
        assertEquals(true, status);

        apple.setPause(true);
        boolean newStatus = apple.getPause();
        assertEquals(true, newStatus);
    }
}
