package com.example.cloud;

import com.example.cloud.model.Users;
import com.example.cloud.repository.CloudRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@SpringBootApplication
public class CloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(CloudRepository users) {
//        return args -> {
//            users.save(new Users(2, "Maks", "321", true));
//        };
//    }
}
