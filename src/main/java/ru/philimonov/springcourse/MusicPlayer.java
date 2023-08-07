package ru.philimonov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music classicalMusic;

    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusicBean") Music classicalMusic,@Qualifier("rockMusicBean") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
