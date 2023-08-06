package ru.philimonov.springcourse;

public class ClassicalMusic implements Music {

    public void init(){
        System.out.println("DOING initialization");
    }

    public void destroy(){
        System.out.println("DOING destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
