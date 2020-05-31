package ru.job4j.police.repository;

import org.springframework.stereotype.Component;
import ru.job4j.police.model.Accident;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class AccidentMem {
    Map<Integer, Accident> accidents = new HashMap<>();

    public AccidentMem() {
        accidents.put(1, new Accident("Ed", "Text", "Address"));
        accidents.put(2, new Accident("Ri", "Some text", "some address"));
    }

    public Collection<Accident> getAll() {
        return accidents.values();
    }
}
