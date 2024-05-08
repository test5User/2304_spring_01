package by.itclass._04_autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("04_autowired.xml");
        System.out.println(ctx.getBean("car"));
    }
}
