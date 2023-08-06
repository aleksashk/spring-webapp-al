package ru.philimonov.springcourse;

public class MusicPlayer {
    private Music music;

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}