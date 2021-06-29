import com.wiciu23.com.repository.HibernateSpeakerRepositoryImpl;
import com.wiciu23.com.repository.SpeakerRepository;
import com.wiciu23.com.service.SpeakerService;
import com.wiciu23.com.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //oznacza, ze plik ma zotać użyty do konfiguracji

public class AppConfig {
    //dodajemy bean, czyli komponent Spring

    @Bean(name = "speakerService")
    public SpeakerService getSpeaker(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }

    //w wcześniejszych wersjach Springa konfiguracje można przeprowadzić za pomocą pliku XML

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
