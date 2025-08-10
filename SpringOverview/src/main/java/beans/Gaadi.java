package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gaadi {
    @Autowired
    private final GaadiServices gaadiServices;

    public Gaadi(GaadiServices gaadiServices) {
        this.gaadiServices = gaadiServices;
    }

    public void startJourney(){
        gaadiServices.playMusic();
        gaadiServices.moveVehicle();
    }
}
