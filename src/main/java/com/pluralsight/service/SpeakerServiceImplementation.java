package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImplementation implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImplementation() {
        System.out.println("SpeakerServiceImplementation no args constructor");
    }
    @Autowired
    public SpeakerServiceImplementation(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    //@Autowired
    public void setRepository(SpeakerRepository repo) {
        this.repository = repo;
    }

}
