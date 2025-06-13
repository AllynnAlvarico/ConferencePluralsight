package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImplementation;

import java.util.List;

public class SpeakerServiceImplementation implements SpeakerService {

    private SpeakerRepository repository = new StubSpeakerRepositoryImplementation();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
