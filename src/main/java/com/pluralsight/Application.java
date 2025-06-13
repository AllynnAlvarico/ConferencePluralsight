package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello Spring Framework!");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)


        //SpeakerService service = new SpeakerServiceImplementation();

        System.out.println(service.findAll().getFirst().getFirstName());


    }
}