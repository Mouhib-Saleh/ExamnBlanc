package tn.esprit.mouhibsaleh;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling
public class MouhibSalehApplication {

    public static void main(String[] args) {
        SpringApplication.run(MouhibSalehApplication.class, args);
    }

}
