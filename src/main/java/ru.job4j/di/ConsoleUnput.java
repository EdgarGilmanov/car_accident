package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class ConsoleUnput {
    public void print(String value) {
        System.out.println(value);
    }
}
