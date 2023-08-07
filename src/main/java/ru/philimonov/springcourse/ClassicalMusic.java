package ru.philimonov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicalMusicBean")
@Scope("prototype")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
