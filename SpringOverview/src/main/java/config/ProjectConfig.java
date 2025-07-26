package config;

import beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean  // Converts return value to Spring Bean
    public Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi 8");
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
