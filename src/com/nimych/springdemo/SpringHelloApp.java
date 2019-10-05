package com.nimych.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("baseballCoach", Coach.class);

        // call methods of the bean
        System.out.println(coach.getDailyWorkout());

        // close the context
        context.close();
    }
}
