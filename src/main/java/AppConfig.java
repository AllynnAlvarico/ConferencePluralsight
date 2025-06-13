// configuration for the application XML
// Bootstrapping Application
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImplementation;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public SpeakerService getSpeakerService() { // this returns the SS interface that
        SpeakerServiceImplementation service = new SpeakerServiceImplementation();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new StubSpeakerRepositoryImplementation();
    }

}
