package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music1 = context.getBean("rockMusicBean", Music.class);
        Music music2 = context.getBean("classicalMusicBean", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();

        context.close();
    }
}
