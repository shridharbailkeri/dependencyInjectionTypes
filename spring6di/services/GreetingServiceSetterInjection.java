package guru.springframework.spring6di.services;


import org.springframework.stereotype.Service;

@Service("setterGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey Im Setting a Greeting from SetterInjected Greeting";
    }
}
