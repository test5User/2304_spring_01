package by.itclass._07_annotation_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //var ctx = new AnnotationConfigApplicationContext(ConnectionManager.class, Dao.class, Service.class, Controller.class);
        var ctx = new AnnotationConfigApplicationContext("by.itclass._07_annotation_config");

//        var cn = ctx.getBean(ConnectionManager.class);
//        var dao = ctx.getBean(Dao.class);
//        var service = ctx.getBean(Service.class);
        var controller = ctx.getBean(Controller.class);

//        System.out.println(cn);
//        System.out.println(dao);
//        System.out.println(service);
        System.out.println(controller);
    }
}
