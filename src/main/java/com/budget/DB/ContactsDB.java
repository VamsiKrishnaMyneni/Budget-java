package com.budget.DB;

import com.budget.repository.ContactsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactsDB {

    @Bean
    CommandLineRunner initDatabase(ContactsRepository repository) {

        return args -> {
            System.out.println("Preloading" + repository.save("John Smith", "123.456.7890"));
            System.out.println("Preloading" + repository.save("John Deo", "123.456.7890"));
        };
    }
}
