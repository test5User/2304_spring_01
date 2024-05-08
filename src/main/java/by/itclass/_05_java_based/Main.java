package by.itclass._05_java_based;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //System.out.println(ctx.getBean("message"));
        System.out.println(ctx.getBean("mess"));

        var cars = List.of(
                ctx.getBean("car1"),
                ctx.getBean("car2"),
                ctx.getBean("car3")
        );

        cars.forEach(System.out::println);
    }
}
