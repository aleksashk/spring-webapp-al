package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());

        musicPlayer1.setVolume(12);

        System.out.println("musicPlayer1 == musicPlayer2: " + (musicPlayer1 == musicPlayer2));

        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
