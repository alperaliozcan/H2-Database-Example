package com.example.H2DatabaseExample.config;

import com.example.H2DatabaseExample.model.Customer;
import com.example.H2DatabaseExample.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2DatabaseLoad {

    @Bean
    CommandLineRunner initH2DatabaseInMemoryExample(CustomerRepository repository) {

        return args -> {
            repository.save(new Customer("Alper Ali Özcan - 1",
                    "alperali@ozcan.com",
                    "İstanbul",
                    "0212-212-00-00"));

            repository.save(new Customer("Alper Ali Özcan - 2",
                    "alperaliozcan@h2dbexample.com",
                    "İstanbul",
                    "0212-000-11-22"));

            repository.save(new Customer("Alper Ali Özcan - 3",
                    "alperaliozcan@h2dbexample2.com",
                    "Sinop",
                    "0368-000-57-57"));
        };
    }
}
