package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private Store store;
    @Autowired
    private ConsoleUnput consoleUnput;

    public void add(String value) {
        store.add(value);
    }


    public void print() {
        for (String value : store.getAll()) {
            consoleUnput.print(value);
        }
    }
}