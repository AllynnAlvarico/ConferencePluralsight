package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImplementation implements SpeakerRepository {


    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Barney");
        speaker.setLastName("Dinosaur");

        speakers.add(speaker);

        return speakers;

    }

}
