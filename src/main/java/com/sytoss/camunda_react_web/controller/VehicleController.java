package com.sytoss.camunda_react_web.controller;

import com.sytoss.camunda_react_web.entity.*;
import com.sytoss.camunda_react_web.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    private final Logger LOGGER = Logger.getLogger(ClientController.class.getName());

    @GetMapping("/get-vehicle")
    public Vehicle getVehicle() {
        LOGGER.info(vehicleService.getVehicle().toString());
        return vehicleService.getVehicle();
    }
}
