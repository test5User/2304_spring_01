package by.itclass._05_java_based;

import by.itclass._02_car.ComplexCar;
import by.itclass._02_car.Engine;
import by.itclass._02_car.SimpleCar;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

public class AppConfig {
    @Bean("mess")
    public String message() {
        return "Hello World!!!";
    }

    @Bean
    public SimpleCar car1() {
        return new SimpleCar();
    }

    @Bean
    public SimpleCar car2() {
        return new SimpleCar("Peugeot 407");
    }

    @Bean
    public Engine engine() {
        return new Engine("Gasoline");
    }

    @Bean
    public ComplexCar car3() {
        var car = new ComplexCar();
        car.setEngine(engine());
        return car;
    }
}
