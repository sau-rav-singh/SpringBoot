package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    private final Gaadi gaadi;

    @Autowired
    public Human(Gaadi gaadi) {
        this.gaadi = gaadi;
    }
    public void travel() {
        System.out.println("Person is starting the journey...");
        gaadi.startJourney();
    }
}
