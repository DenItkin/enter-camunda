package com.sytoss.camunda_react_web.service;

import com.sytoss.camunda_react_web.entity.Client;
import com.sytoss.camunda_react_web.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
   ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }
}
