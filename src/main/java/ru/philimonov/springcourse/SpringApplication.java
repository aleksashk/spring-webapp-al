package ru.philimonov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = (TestBean) context.getBean("testBean");

        System.out.println(testBean.getName());
    }
}
