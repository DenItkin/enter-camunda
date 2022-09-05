package com.sytoss.camunda_react_web.controller;

import com.sytoss.camunda_react_web.entity.Client;
import com.sytoss.camunda_react_web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ClientController {

    @Autowired
    ClientService clientService;

    private final Logger LOGGER = Logger.getLogger(ClientController.class.getName());

    @PostMapping("/add-client")
    @ResponseBody
    public Client addClient(@RequestBody Client client) {
        LOGGER.info(client.toString());
        return clientService.saveClient(client);
    }
}
