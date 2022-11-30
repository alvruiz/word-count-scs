package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaWordCountApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWordCountApplication.class, args);
    }

}
