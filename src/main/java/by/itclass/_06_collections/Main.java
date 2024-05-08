package by.itclass._06_collections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(LibConfig.class);
        System.out.println(ctx.getBean(Library.class));
    }
}
