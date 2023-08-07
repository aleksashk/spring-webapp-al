package ru.philimonov.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.philimonov.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayerBean());
    }

    @Bean
    public MusicPlayer musicPlayerBean() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

}
