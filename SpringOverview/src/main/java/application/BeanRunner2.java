package application;

import beans.Student;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class BeanRunner2 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Random random = new Random();
        int number = random.nextInt(10);

        Supplier<Student> sauravSupplier = () -> {
            Student s = new Student();
            s.setName("Saurav");
            return s;
        };

        Supplier<Student> aadilSupplier = () -> {
            Student a = new Student();
            a.setName("Aadil");
            return a;
        };

        String studentBeanName;
        if (number % 2 == 0) {
            studentBeanName = "Saurav";
            context.registerBean(studentBeanName, Student.class, sauravSupplier);
        } else {
            studentBeanName = "Aadil";
            context.registerBean(studentBeanName, Student.class, aadilSupplier);
        }

        // Retrieve the dynamically registered Student bean by its name for clarity
        Student registeredStudent = context.getBean(studentBeanName, Student.class);
        System.out.println("Dynamically registered student: " + registeredStudent.getName());

        context.close(); // Good practice to close the context
    }
}