package ru.alishev.springcourse.alishevSpringFramework.lesson9Annotation;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
