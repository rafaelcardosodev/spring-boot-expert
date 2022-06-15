package com.github.rafaelcardosodev;

import com.github.rafaelcardosodev.domain.model.Cliente;
import com.github.rafaelcardosodev.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired ClienteRepository clienteRepository) {
        return args -> {
            clienteRepository.save(new Cliente("Rafael"));
            clienteRepository.save(new Cliente("Mauro"));

            List<Cliente> clienteList = clienteRepository.getAll();
            clienteList.forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
