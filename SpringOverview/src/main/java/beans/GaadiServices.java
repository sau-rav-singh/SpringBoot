package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GaadiServices {

    private final Speaker speaker;
    private final Tyre tyre;

    @Autowired
    public GaadiServices(Speaker speaker, Tyre tyre) {
        this.speaker = speaker;
        this.tyre = tyre;
    }
    public void playMusic() {
        System.out.println(speaker.makeSound());
    }

    public void moveVehicle() {
        System.out.println(tyre.rotate());
    }
}
