package application;

import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleOne {
    public static void main(String[] args) {

        var vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context: " + vehicle.getName());

        // Initialize Spring IoC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Spring-managed beans
        Vehicle springVehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context: " + springVehicle.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from spring context: " + hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value from spring context: " + number);
    }
}
