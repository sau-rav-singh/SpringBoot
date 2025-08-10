package beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MRFTyres implements Tyre {
    @Override
    public String rotate() {
        return "MRF Tyres";
    }
}
