package beans;

import org.springframework.stereotype.Component;

@Component
public class ApolloTyres implements Tyre {
    @Override
    public String rotate() {
        return "Apollo Tyres";
    }
}
