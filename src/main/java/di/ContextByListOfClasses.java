package di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import di.model.StartUI;
import di.model.Store;

public class ContextByListOfClasses {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class, StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}
