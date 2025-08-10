package beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speaker{
    @Override
    public String makeSound() {
        return "Bose Sound";
    }
}
