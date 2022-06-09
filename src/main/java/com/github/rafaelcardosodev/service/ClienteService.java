package com.github.rafaelcardosodev.service;

import com.github.rafaelcardosodev.model.Cliente;
import com.github.rafaelcardosodev.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {


    @Autowired
    private ClienteRepository repository;

    // alternative ways to inject dependency
//    @Autowired -- this annotation is optional 'cause spring already knows he has to instantiate this class
//    public ClienteService(ClienteRepository repository) {
//        this.repository = repository;
//    }

//    @Autowired
//    public void setRepository(ClienteRepository repository) {
//        this.repository = repository;
//    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {
        //validaçoes
    }
}
