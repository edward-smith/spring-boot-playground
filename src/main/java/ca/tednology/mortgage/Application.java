package ca.tednology.mortgage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application.
 *
 * @author Edward Smith
 */
@SpringBootApplication
public class Application {

    // java -jar ca-mortgage-1.0.0.jar -Dspring.active.profiles=production
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
