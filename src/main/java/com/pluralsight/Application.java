package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImplementation;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello Spring Framework!");

        SpeakerService service = new SpeakerServiceImplementation();

        System.out.println(service.findAll().getFirst().getFirstName());


    }
}