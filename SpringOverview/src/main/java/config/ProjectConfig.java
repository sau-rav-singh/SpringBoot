package config;

import beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

    @Bean(name = "audiVehicle")  // Converts return value to Spring Bean
    public Vehicle audi() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }

    @Bean
    @Primary
    public Vehicle toyota() {
        var vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Vehicle ferari() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferari");
        return vehicle;
    }

    @Bean
    @Qualifier("bmwVehicle")
    public Vehicle bmw() {
        var vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }

    @Bean
    public String hello() {
        return "Hello World";
    }

    @Bean
    public Integer number() {
        return 16;
    }

}
