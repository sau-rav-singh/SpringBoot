package application;

import beans.Person;
import beans.Vehicle;
import config.AutoWiredConfig;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiRunner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person lucy = context.getBean(Person.class);

        // The Vehicle injected into Lucy will be the @Primary one (Toyota)
        System.out.println("Lucy Drives " + lucy.getVehicle().getName());

        // You can also get other vehicles explicitly if needed
        Vehicle audi = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Another vehicle: " + audi.getName());
        context.close();

        var autoWiredContext=new AnnotationConfigApplicationContext((AutoWiredConfig.class));
        Person AutoWired=autoWiredContext.getBean(Person.class);
        System.out.println("AutoWired Lucy Drives " + AutoWired.getVehicle().getName());

    }
}
