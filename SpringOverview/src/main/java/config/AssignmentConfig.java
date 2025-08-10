package config;

import beans.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "beans", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Person.class))
public class AssignmentConfig {
}
