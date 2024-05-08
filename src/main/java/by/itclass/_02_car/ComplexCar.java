package by.itclass._02_car;

import java.util.StringJoiner;

public class ComplexCar extends SimpleCar {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ComplexCar() {
    }

    public ComplexCar(int id, String model, Engine engine) {
        super(id, model);
        this.engine = engine;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ComplexCar.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("model='" + model + "'")
                .add("engine=" + engine)
                .toString();
    }
}
