package by.itclass._02_car;

import java.util.StringJoiner;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
