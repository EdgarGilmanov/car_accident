package ru.job4j.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class ConsoleUnput {
    public void print(String value) {
        System.out.println(value);
    }
}
