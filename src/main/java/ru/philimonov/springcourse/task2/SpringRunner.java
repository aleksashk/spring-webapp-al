package ru.philimonov.springcourse.task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("task2/applicationContext.xml");

        Music music = (Music) context.getBean("musicBean");

        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
    }
}
