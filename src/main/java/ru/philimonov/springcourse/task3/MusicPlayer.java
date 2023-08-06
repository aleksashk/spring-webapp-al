package ru.philimonov.springcourse.task3;

public class MusicPlayer {
    private Music music;

    //Ioc
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
