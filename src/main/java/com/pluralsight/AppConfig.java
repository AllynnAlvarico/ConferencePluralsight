package com.pluralsight;
// configuration for the application XML
// Bootstrapping Application
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImplementation;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImplementation;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /*
    @Bean(name="speakerService")
//    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)  -> different/unique
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() { // this returns the SpeakerService interface that
//        SpeakerServiceImplementation service = new SpeakerServiceImplementation(getSpeakerRepository());
        SpeakerServiceImplementation service = new SpeakerServiceImplementation();
//        service.setRepository(getSpeakerRepository());
        return service;
    }
     */

    /*
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        // the "new StubSpeakerRepositoryImplementation() is a class that add an example data to the project
        return new StubSpeakerRepositoryImplementation();
    }
     */

}
