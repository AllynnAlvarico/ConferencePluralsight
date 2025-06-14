package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello Spring Framework!");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); // This is calling the config code class

        //SpeakerService service = new SpeakerServiceImplementation();

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
//        SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.hashCode());
//        System.out.println(service2.hashCode());

        System.out.println(service.findAll().getFirst().getFirstName());


    }
}