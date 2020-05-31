package ru.job4j.di;

public class StartUI {

    private Store store;
    private ConsoleUnput consoleUnput;

    public StartUI(Store store, ConsoleUnput input) {
        this.store = store;
        this.consoleUnput = input;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            consoleUnput.print(value);
        }
    }
}