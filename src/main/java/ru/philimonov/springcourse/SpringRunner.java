package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusicBean1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusicBean2 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        System.out.println("classicalMusicBean1 == classicalMusicBean2 -> " + (classicalMusicBean1 == classicalMusicBean2));

        context.close();
    }
}
