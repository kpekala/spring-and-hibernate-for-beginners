package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.demo.one.model.Coach;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
