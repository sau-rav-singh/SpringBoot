package application;

import beans.Animal;
import beans.Vehicle;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanRunner {
    public static void main(String[] args) {

        var vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context: " + vehicle.getName());

        // Initialize Spring IoC Container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Spring-managed beans
        Vehicle springVehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from spring context: " + springVehicle.getName());

        Vehicle bmwVehicle = context.getBean("bmw",Vehicle.class);
        System.out.println("Qualifier Vehicle name from spring context: " + bmwVehicle.getName());

        Vehicle audiVehicle = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("audiVehicle name from spring context: " + audiVehicle.getName());

        Vehicle ferariVehicle = context.getBean("ferari",Vehicle.class);
        System.out.println("ferariVehicle name from spring context: " + ferariVehicle.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from spring context: " + hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value from spring context: " + number);

        //Using Component
        var animalContext = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Animal animal = animalContext.getBean(Animal.class);
        System.out.println("Component Animal name from spring context: " + animal.getName());
        animal.printHello();

        context.close();
        animalContext.close();
    }
}
