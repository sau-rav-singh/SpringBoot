package beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    //@Component is not required when using registerBeans
    private String Name;
}
