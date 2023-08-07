package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusicBean1 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusicBean1.getSong());

        context.close();
    }
}
