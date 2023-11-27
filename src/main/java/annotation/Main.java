package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext("annotation");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Man man = context.getBean(Man.class);
        man.print();
        man.print2();
    }
}