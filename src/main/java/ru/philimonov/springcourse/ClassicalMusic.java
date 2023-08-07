package ru.philimonov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit() {
        System.out.println("ClassicalMusic Initialization");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("ClassicalMusic Destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
