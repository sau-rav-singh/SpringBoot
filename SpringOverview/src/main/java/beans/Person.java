package beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {
    private String Name;
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("bmwVehicle") Vehicle vehicle) {
        System.out.println("Person constructor called");
        this.vehicle = vehicle;
    }
}
