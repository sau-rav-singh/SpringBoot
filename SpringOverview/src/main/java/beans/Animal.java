package beans;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Animal {
    private String name;

    public void printHello() {
        System.out.println("Hello from Animal bean!");
    }

    @PostConstruct
    public void initialize() {
        this.name = "Sher";
    }
}
