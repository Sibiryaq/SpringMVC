package ru.alishev.springcourse.alishevSpringFramework.lesson12ValuePostConstructPreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
