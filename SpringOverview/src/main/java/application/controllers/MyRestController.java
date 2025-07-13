package application.controllers;

import application.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    private final Coach myCoach;
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @Autowired
    public MyRestController(Coach coach) {
        myCoach = coach;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello Mr " + coachName;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
