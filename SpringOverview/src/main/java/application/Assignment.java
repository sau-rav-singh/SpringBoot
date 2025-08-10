package application;

import beans.Human;
import config.AssignmentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assignment {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(AssignmentConfig.class);
        Human human=context.getBean(Human.class);
        human.travel();
    }
}
