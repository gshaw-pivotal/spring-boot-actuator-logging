package gs.al.actuatorlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActuatorLogging {

    @Bean
    public TraceRepository getHttpTraceRepository() {
        return new TraceRepository();
    }

    public static void main(String[] args) {
        SpringApplication.run(ActuatorLogging.class, args);
    }
}
