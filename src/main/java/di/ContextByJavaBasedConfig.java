package di;

import di.model.StartUI;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("di.model");
        var ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
