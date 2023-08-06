package ru.philimonov.springcourse.task1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("task1/applicationContext.xml");
        TestBean testBean = (TestBean) context.getBean("testBean");

        System.out.println(testBean.getName());
        context.close();
    }
}
